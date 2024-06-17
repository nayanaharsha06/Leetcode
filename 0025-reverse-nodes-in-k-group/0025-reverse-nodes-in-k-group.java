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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Count the number of nodes in the list
        ListNode temp = dummy;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        temp = dummy;
        while (temp.next != null) {
            if (count < k) break; // If fewer than k nodes remain, no more reversing
            
            int nodes = k - 1;
            ListNode tempNext = temp.next; // The start of the current k-group
            ListNode first = temp.next;
            ListNode second = first.next;

            // Reverse the current k-group
            while (nodes-- > 0) {
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
            }

            count -= k;
            // Adjust pointers to link the reversed k-group with the rest of the list
            temp.next = first;
            tempNext.next = second;
            temp = tempNext; // Move temp to the end of the reversed section
        }
        return dummy.next;
    }
}
