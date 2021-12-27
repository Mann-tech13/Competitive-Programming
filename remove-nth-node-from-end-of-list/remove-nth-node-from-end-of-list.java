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
        if(head.next == null){
            return null;
        }
        
        ListNode newPtr = head;
        int len = 0;
        while(newPtr != null){
            len++;
            newPtr = newPtr.next;
        }
        
        if(len == n){
            return head.next;
        }
        
        ListNode temp = head;
        for(int i=1; i<len-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}