/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        //edge cases - 0,1 elements
        if(head == null || head.next == null) {
            return false;
        }
        
        //two pointer method - what happens if it is a cycle - at some point slow == fast -> return true
        //                     what happens if its not a cycle - fast.next.next == null -> return false
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next != null && fast.next.next != null) {
            if(slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}