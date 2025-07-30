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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // creating a dummy node that then points to the head of our list
        ListNode dummy = new ListNode(0, head);
        // creating two pointers, both starting at the dummy node
        ListNode first = dummy;
        ListNode second = dummy;

        // moving the first pointer 'n' steps ahead so that the gap between first and second is 'n'
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // moving both pointers forward until the first pointer reaches the end of the list, second will be just before the node we want to remove
        while (first != null) {
            first = first.next; 
            second = second.next;
        }

        // skipping the nth node from the end
        second.next = second.next.next;

        // returning the new head of the list (which is the node after the dummy node)
        return dummy.next;
    }
}
