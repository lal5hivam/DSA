class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] nse = new int[n], nge = new int[n];
        int[] pse = new int[n], pge = new int[n];
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        for(int i = n - 1; i >= 0; i--) {
            while(!max.isEmpty() && nums[max.peek()] <= nums[i]) {
                max.pop();
            }
            while(!min.isEmpty() && nums[min.peek()] >= nums[i]) {
                min.pop();
            }
            nge[i] = max.isEmpty() ? n - i : max.peek() - i;
            nse[i] = min.isEmpty() ? n - i : min.peek() - i;
            max.push(i);
            min.push(i);
        }
        max.clear();
        min.clear();
        for(int i = 0; i < n; i++) {
            while(!max.isEmpty() && nums[max.peek()] < nums[i]) {
                max.pop();
            }
            while(!min.isEmpty() && nums[min.peek()] > nums[i]) {
                min.pop();
            }
            pge[i] = max.isEmpty() ? i + 1 : i - max.peek();
            pse[i] = min.isEmpty() ? i + 1 : i - min.peek();
            max.push(i);
            min.push(i);
            long contri = (long) ((nge[i] * pge[i]) - (nse[i] * pse[i])) * (long) nums[i];
            sum += contri;
        }
        return sum;
    }
}
