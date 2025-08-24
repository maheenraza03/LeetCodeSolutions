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
    public ListNode swapPairs(ListNode head) {
        
        // creating a dummy node
        ListNode dummyNode = new ListNode(0, head);
        // creating a pointer that points to our new dummy node
        ListNode prev = dummyNode;

        // making sure the next 2 nodes actually have values in them
        while(prev.next != null && prev.next.next != null) {
            // the first node in the swapping pair is the one right after the dummy node
            ListNode first = prev.next;
            // the second node in the swapping pair is the one right after the first one
            ListNode second = prev.next.next;
            // the node after the second node
            ListNode nextPair = second.next;

            // perform the swap
            prev.next = second;
            second.next = first;
            first.next = nextPair;

            // move the pointer up
            prev = first;
        }

        // return the list
        return dummyNode.next;
    }
}