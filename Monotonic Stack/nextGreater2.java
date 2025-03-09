class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); // Initialize answer array with -1

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[index]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[index] = nums[stack.peek()];
            }
            stack.push(index);
        }
        return ans;
    }
}
