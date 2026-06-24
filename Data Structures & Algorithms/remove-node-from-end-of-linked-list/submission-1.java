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
        int len= 0;
        ListNode temp= head;
        while (temp!=null) {
            temp= temp.next;
            len++;
        }

        int iterations= len- n;
        temp= head;
        while (iterations> 1) {
            temp= temp.next;
            iterations--;
        }

        if (n== 1 && len== 1) return null;

        if (n== len) return head.next;

        temp.next= temp.next.next;
        return head;
    }
}
