/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        ListNode slow = head;
        ListNode fast = head;
        
        // Phase 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode start = head;
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
        
        return start; 
    }
}