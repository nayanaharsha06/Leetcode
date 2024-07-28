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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if (l1 == null) return l2;
       if(l2 == null) return l1;

       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;


       while(l1 != null && l2 != null){
        if(l1.val <= l2.val ){
            curr.next = l1;
            l1 = l1.next;
        }else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
       }
       curr.next = l1 != null ? l1 : l2;
       return dummy.next;
        
    }
}
/*
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        If you were to use dummy.next instead of curr.next, you would 
        always be changing the next pointer of the dummy node, which is not
        the intended behavior. The dummy node should remain fixed at the 
        start of the list, while curr moves forward.

        curr.next = l1 != null ? l1 : l2;
        return dummy.next;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two sorted linked lists: l1 = 1->3->5, l2 = 2->4->6
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Print original lists
        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);

        // Merge the two lists
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // Print merged list
        System.out.print("Merged List: ");
        printList(mergedList);
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
}

*/
