class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //STORED IN REVERSE ORDER!!! but i was ready to keep track of prev..
        
        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode headPtr = head;
        
        while(l1 != null || l2 != null) {
            if(l2 == null) {l2 = new ListNode(0);}
            if(l1 == null) {l1 = new ListNode(0);}
            int sum = l1.val + l2.val + carry;
            // 9 check
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            // node creation
            ListNode add = new ListNode(sum);
            head.next = add;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(carry == 1) {
            ListNode add = new ListNode(carry);
            head.next = add;
            head = head.next;
        }
        
        return headPtr.next;
    }
        
}