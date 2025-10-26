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
    public ListNode deleteDuplicates(ListNode head) {
        // make a list to store the values that appear in the ListNode
        List<Integer> listOfValues = new ArrayList<>();
        // create a node that points to head
        ListNode currentNode = head;
        // create a node that will point to the node that comes before currentNode
        ListNode previousNode = null;

        // loop through the ListNode as long as the currentNode isn't null
        while (currentNode != null) {
            // if the value already exists in the list created above, get rid of that node
            if (listOfValues.contains(currentNode.val)) {
                // have the node that comes before the node to be deleted point to the node that comes after it
                previousNode.next = currentNode.next;
            // if it's not in the list, add it
            } else {
                listOfValues.add(currentNode.val);
                // previous node is now that node we were at (only move it when we don't delete anything)
                previousNode = currentNode;
            }

            // current node moves to the next node
            currentNode = currentNode.next;

            
        }

        // return the listnode
        return head;

    }
}