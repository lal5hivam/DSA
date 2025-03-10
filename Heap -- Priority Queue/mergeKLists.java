class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });
        for (ListNode node : lists) {
            if (node != null) minHeap.offer(node);
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            prev.next = node;
            prev = prev.next;
            if (node.next != null) minHeap.offer(node.next);
        }
        return dummy.next;
    }
}
