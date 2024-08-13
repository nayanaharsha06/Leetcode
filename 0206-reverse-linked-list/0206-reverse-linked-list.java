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

        // Recursively reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Set the next node's next pointer to point back to the current node
        head.next.next = head;

        // Set the current node's next pointer to null (to avoid cycles)
        head.next = null;

        // Return the new head of the reversed list
        return newHead;
    }
}
/*
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x){
        val = x;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.print("Original List: ");
        printList(head);

        // Reverse the linked list
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.print("Reversed List: ");
        printList(reversedHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}*/