/** https://www.youtube.com/watch?v=1dW442I3xrI
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
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head == null) {
            return null; // Edge case: empty list
        }
       ListNode temp = head;
       int count = 1;
       while(temp.next != null){
        count++;
        temp = temp.next;
       }
       int steps = count - n;
       if(steps == 0){
        return head.next;
       }
       temp = head;
       for(int  i = 1; i < steps; i++){
        temp = temp.next;
       }
       temp.next = temp.next.next;
       return head;

    }
}