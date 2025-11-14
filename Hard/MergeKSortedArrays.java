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
    public ListNode mergeKLists(ListNode[] lists) {
        // checking if the array is null or if the length is 0
        if (lists == null || lists.length == 0) {
            return null;
        }

        // as long as there's a linked list in the array
        while (lists.length > 1) {
            // creating a single list to merge everything
           ListNode[] mergedLists = new ListNode[(lists.length + 1) / 2];
           int index = 0;

            for (int i = 0; i < lists.length; i+=2) {
                // loop through the array and create two lists to pass into the function
                ListNode list1 = lists[i];
                
                ListNode list2 = (i + 1 < lists.length) ? lists[i + 1] : null;

                // using the mergeTwoLists function previously made
                mergedLists[index++] = mergeTwoLists(list1, list2);

            }
            lists = mergedLists;
        }


        // return the first list
        return lists[0];

    }

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // create a dummy node to have all the values
        ListNode dummyNode = new ListNode();
        // a pointer to move the values
        ListNode current = dummyNode;

        // the loop happens as long as the lists aren't null
        while (list1 != null && list2 != null) {
            // if list1's val id smaller than list 2, the pointer points to list1 anf move to the next
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                // otherwise point to list2 and move to the next
                current.next = list2;
                list2 = list2.next;
            }
            // next node in the new list
            current = current.next;
        }

        // making sure if any values are left in either list1 or 2 and adding them to the end
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // returning the dummy list but the next value
        return dummyNode.next;
    }
}