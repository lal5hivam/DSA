class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        int index = 0;
        LinkedList<Integer> q = new LinkedList<>();
        int l = 0, r = 0;
        while (r < arr.length) {
            while (!q.isEmpty() && arr[q.peekLast()] < arr[r]) q.pollLast();
            q.offer(r);
            if (q.peek() < l) q.poll();
            if ((r + 1) >= k) {
                res[index++] = arr[q.peek()];
                l++;
            }
            r++;
        }
        return res;
    }
}
