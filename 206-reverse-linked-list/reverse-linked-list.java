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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = null;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        return helper(temp,temp1,temp2);
    }

    public ListNode helper(ListNode temp,ListNode temp1, ListNode temp2){
        if(temp1 == null) return temp;
        temp1.next = temp;
        temp = temp1;
        temp1 = temp2;
        if(temp2 != null ){
            temp2 = temp2.next;
        }
        return helper(temp,temp1,temp2);
    }
}