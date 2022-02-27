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
    public ListNode reverseActual(ListNode head, ListNode kPlus1) { //code to Reverse a linked list
        
		ListNode prev = null;
		ListNode curr = head;

		while (curr != kPlus1) {
			ListNode currNext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = currNext;
		}

		head = prev;
        return head;
	}
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null){
            return head;
        }
 
        ListNode kPlus1 = head;
        for(int i=0; i<k; i++) {
            if(kPlus1 == null) {
                return head;
            }
            kPlus1 = kPlus1.next;
        }
        
        ListNode newHead = reverseActual(head, kPlus1);
        head.next = reverseKGroup(kPlus1, k);
        return newHead;
    }
}
