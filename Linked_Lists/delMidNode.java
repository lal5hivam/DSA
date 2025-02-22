class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode mid = head;
        
        ListNode temp = null;
        ListNode end = head;
        while(end != null && end.next != null){
            temp = mid;
            end = end.next.next;
            mid = mid.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
