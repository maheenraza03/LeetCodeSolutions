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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // placeholder list
        ListNode dummyHead = new ListNode(0);
        // where we start
        ListNode current = dummyHead;
        // to store carries
        int carry = 0;
        // the loop will only continue while there are digits left or a carry exist
        while (l1 != null || l2 != null || carry != 0) {
            // grab the current digit
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // add digits
            int sum = val1 + val2 + carry;
            // update carry
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            // move on to the next
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}