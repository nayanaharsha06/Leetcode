//https://www.youtube.com/watch?v=6EBW66TUIeg
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = head; // Start of odd indexed nodes
        ListNode curr = head.next; // Start of even indexed nodes
        ListNode head2 = curr; // Store the start of even indexed nodes
        
        while (curr != null && curr.next != null) {
            prev.next = curr.next; // Link current odd node to the next odd node
            prev = prev.next; // Move prev pointer to the next odd node
            curr.next = prev.next; // Link current even node to the next even node
            curr = curr.next; // Move curr pointer to the next even node
        }
        
        prev.next = head2; // Link the end of the odd list to the start of the even list
        
        return head;
    }
}
