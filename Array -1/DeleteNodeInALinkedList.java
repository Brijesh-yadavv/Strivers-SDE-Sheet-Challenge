/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
        ListNode nextt=node.next;
        ListNode prev=null;
        while(nextt!=null){
            prev=curr;
            curr.val=nextt.val;
            curr=curr.next;
            nextt=nextt.next;
        }
        prev.next=null;
        
    }
}
