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

 //one pass solution preferred
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        // ListNode fast=head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;

        for(int i=1;i<k;i++){
            slow=slow.next;
        }

        ListNode fast=slow;

        while(fast.next!=null){
            fast=fast.next;
            temp=temp.next;
        }

        int tempVal=temp.val;
        temp.val=slow.val;
        slow.val=tempVal;

        return head;
    }
}




//Two pass solution
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//      int len=0;
//      ListNode temp=head;
//      while(temp!=null){
//         temp=temp.next;
//         len++;
//      }

//     ListNode first=head;
//      for(int i=1;i<=k-1;i++){
//         first=first.next;
//      }


//     ListNode second=head;
//      for(int i=1;i<=len-k;i++){
//         second=second.next;
//      }

//      int tempVal=first.val;
//      first.val=second.val;
//      second.val=tempVal;

//      return head;
//     }
// }