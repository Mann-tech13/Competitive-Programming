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
        ListNode ans = new ListNode(0);
        ListNode traverse = ans;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            // int sum = l1.val + l2.val + carry;
            int value_l1 = 0;
            int value_l2 = 0;
            
            if(l1 != null){
                value_l1 = l1.val;
            }
            if(l2 != null){
                value_l2 = l2.val;
            }
            int sum = value_l1 + value_l2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            ListNode append_node = new ListNode(digit);
            traverse.next = append_node;
            
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            traverse = traverse.next;
        }
        
        if(carry > 0){
            ListNode append_node = new ListNode(carry);
            traverse.next = append_node;
            traverse = traverse.next;
        }
        
        return ans.next;
    }
}