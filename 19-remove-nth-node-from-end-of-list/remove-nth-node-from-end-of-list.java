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

 //Aproach 1 --> optimized by slow and fast pointer approach 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        //move fast n steps a head 
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){ //n==length  
        //i have to delete the head
            return head.next;
        }
        //move slow and fast together until fast reaches tail
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;

    }
}



//Approach 2
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode temp=head;
//         int len=0;
//         while(temp!=null){
//             temp=temp.next;
//             len++;
//         }

//         //edge cases 
//         if(len==1)  return null;
//         if(len==n) {
//          return head.next;
//         }

//         //nth from end == len-n+1 from start
//         //we need temp =len-n;
//         temp=head;
//         for(int i=1;i<=len-n-1;i++){
//             temp=temp.next;

//         }
//         //deletion
//         temp.next=temp.next.next;

//         return head;
//     }
// }