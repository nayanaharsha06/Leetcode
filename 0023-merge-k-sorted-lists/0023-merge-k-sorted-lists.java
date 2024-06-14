/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);
        return merge(left, right);
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }else{
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }
        if(l1 != null){
            current_node.next = l1;
        }else{
            current_node.next = l2;
        }
        return temp_node.next;
        
    }
}