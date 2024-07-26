class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head;
        ListNode med = head;
        ListNode slow = head;
        
        while(n!=0){
            fast=fast.next;
            n--;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null){
            slow=med;
            med=med.next;
            fast=fast.next;
        }
        slow.next=med.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
    }
}