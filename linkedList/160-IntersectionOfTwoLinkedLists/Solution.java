public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == headB) {
            return headA;
        }
        if(headA == null || headB == null) {
            return null;
        }
        
        
        ListNode a = headA;
        ListNode b = headB;
        HashSet<ListNode> set = new HashSet<>();
        
        while(a != null) {
            set.add(a);
            a = a.next;
        }
        while(b != null) {
            if(set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        
        return null;
    }
}