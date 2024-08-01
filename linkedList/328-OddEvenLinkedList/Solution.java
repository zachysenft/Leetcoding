class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        //if our linked list is empty or if it contains only two elements, we return head
        if(head == null || head.next == null){
            return head;
        }
        
        //create two pointers, odd and even, to store the elements at odd and even positions
        ListNode odd = head;
        ListNode even = head.next;
        
        //create another pointer for head of even list, evenhead. to merge after traversal
        ListNode evenhead =  head.next;
        
        
        //traverse through the list til end of list
        //even pointer is always ahead of odd, traverse til even reaches end of list
        while(even!=null && even.next!=null){ 
            odd.next =  odd.next.next; 
            even.next =  even.next.next;
            
            odd  =  odd.next;
            even =  even.next;
        }
        
        //combine the odd and even list
        odd.next =  evenhead;   
        return head;  
    }
}