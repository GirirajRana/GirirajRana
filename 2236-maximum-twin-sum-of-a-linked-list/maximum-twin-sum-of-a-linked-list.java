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
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = null;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverseList(slow);
        ListNode temp = head;
        int maxsum=Integer.MIN_VALUE;
        while(newHead!=null){
            if(maxsum<temp.val+newHead.val){
                maxsum=temp.val+newHead.val;
            }
            temp=temp.next;
            newHead=newHead.next;
        }
        return maxsum;
    }
}