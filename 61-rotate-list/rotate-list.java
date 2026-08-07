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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0){
            return head;
        }

        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){//fast will be at tail
            slow=slow.next;
            fast=fast.next;
        }


        ListNode newHead=slow.next;
        slow.next=null;  //slow is now the new tail
        fast.next=head;
        return newHead;
    }
}