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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node_1= list1;
        ListNode node_2= list2;
        ListNode head= new ListNode(0);
        ListNode answer= head;
        while (node_1!=null && node_2!=null) {
            if (node_1.val<= node_2.val) {
                ListNode temp= new ListNode(node_1.val);
                answer.next= temp;
                answer= answer.next;
                node_1= node_1.next;
            } else {
                ListNode temp= new ListNode(node_2.val);
                answer.next= temp;
                answer= answer.next;
                node_2= node_2.next;
            }
        }

        answer.next= node_1!=null? node_1: node_2;
        return head.next;
    }
}