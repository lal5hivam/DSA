class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode h2 = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return h2;
    }
}
