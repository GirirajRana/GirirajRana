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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;

        if(len==1){
            return null;
        }
        int mid=len/2;
        for(int i=1;i<=mid-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        len--;

        return head;

    }
}