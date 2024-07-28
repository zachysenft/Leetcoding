class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) {
            return null;
        }
        
        ListNode ptr = head;
        
        while(ptr.next != null) {
            ListNode newHead = ptr.next;
            ptr.next = newHead.next;
            newHead.next = head;
            head = newHead;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
    }

}