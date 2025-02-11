class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        else if(head.next == null) return head;
        else{
            ListNode temp = new ListNode(head.next.val);
            head.next.val = head.val;
            head.val = temp.val;
            if(head.next.next != null){
               head.next.next = swapPairs(head.next.next);     
            }
            return head;
        }
    }
}