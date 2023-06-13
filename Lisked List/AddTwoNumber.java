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
 /*   public ListNode ListNodee(int val,ListNode n){
        ListNode.val=val;
            ListNode.next=n;
        return ListNode;
    }*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode tempp=null;
        int n1c=0;
        int n2c=0;
        while(temp1!=null){
            n1c++;
            temp1=temp1.next;
        }
         while(temp2!=null){
            n2c++;
            temp2=temp2.next;
        }
        temp1=l1;
        temp2=l2;
        if(n1c>=n2c){
            int c=0;
            while(temp1!=null && temp2!=null){
                int a1=temp1.val;
                int a2=temp2.val;
                int ans=a1+a2+c;
                if(ans<10){
                    c=0;
                    temp1.val=ans;
                }else{
                    temp1.val=ans%10;
                    c=ans/10;
                }
                tempp=temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while(temp1!=null){
                  int s=temp1.val+c;
                temp1.val=s%10;
                c=s/10;
                tempp=temp1;
                temp1=temp1.next;
            }
            if(c!=0){
                ListNode ln=new ListNode(c,null);
                tempp.next=ln;
            }
            return l1;
        }
        else{
             int c=0;
            while(temp1!=null && temp2!=null){
                int a1=temp1.val;
                int a2=temp2.val;
                int ans=a1+a2+c;
                if(ans<10){
                    c=0;
                    temp2.val=ans;
                }else{
                    temp2.val=ans%10;
                    c=ans/10;
                }
                tempp=temp2;
                temp1=temp1.next;
                temp2=temp2.next;}
                while(temp2!=null){
                int s=temp2.val+c;
                temp2.val=s%10;
                c=s/10;
                    tempp=temp2;
                    temp2=temp2.next;
            
        }
            if(c!=0){
                 ListNode lnn=new ListNode(c,null);
                tempp.next=lnn;
            }
       return l2;
    }
}}
