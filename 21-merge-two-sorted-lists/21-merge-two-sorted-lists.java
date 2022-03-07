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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode linkedList;
        
        if(l1.val < l2.val){
            linkedList = l1;
            l1 = l1.next;
        }
        else{
            linkedList = l2;
            l2 = l2.next;
        }
        
        ListNode res = linkedList;
        
        while(l1 != null && l2 != null){
            
            if(l1.val <= l2.val){
                linkedList.next = l1;
                l1 = l1.next;
            }
            else{
                linkedList.next = l2;
                l2 = l2.next;
            }
            linkedList = linkedList.next;
            
        }
        
        if(l1 == null){
            linkedList.next = l2;
        }
        else{
            linkedList.next = l1;
        }
        
        return res;
        
    }
}