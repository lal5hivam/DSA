class Solution {
    public void reorderList(ListNode head) {
        if(head == null) return;
        
        ListNode s = head;
        ListNode f = head.next;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        ListNode sechead = s.next;
        s.next = null;

        ListNode curr = sechead;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        sechead = prev;

        ListNode t1, t2;
        while(sechead != null){
            t1 = head.next;
            t2 = sechead.next;
            head.next = sechead;
            sechead.next = t1;
            head = t1;
            sechead = t2;
        }

    }
}
