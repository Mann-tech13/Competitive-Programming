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
        ListNode p = head;
        ListNode q = p.next;
        ListNode r = q.next;
        
        p.next = null;
        while (q != null) {
            q.next = p;
            p = q;
            q = r;
            r = r != null? r.next : null;
        }
        
        head = p;
        return head;
    }
}