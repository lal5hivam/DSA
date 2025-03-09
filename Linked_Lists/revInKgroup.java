class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) return head; 
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        ListNode curr = head, prev = null, next = null, mark = null;
        boolean isFirstGroup = true;
        for (int i = 0; i < length / k; i++) {
            ListNode last = curr; 
            prev = null;            
            for (int j = 0; j < k; j++) { 
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (isFirstGroup) {
                head = prev;
                isFirstGroup = false;
            } else { 
                mark.next = prev;
            }
            mark = last;
        }
        mark.next = curr; 
        return head;
    }
}
