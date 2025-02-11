class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    public int maxSubArray(int[] nums, int left, int right) {
        if (left > right) return Integer.MIN_VALUE;
        
        int mid = (left + right) / 2;
        int leftSum = 0, curSum = 0;
        for (int i = mid - 1; i >= left; i--) {
            curSum += nums[i];
            leftSum = Math.max(leftSum, curSum);
        }

        int rightSum = 0;
        curSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            curSum += nums[i];
            rightSum = Math.max(rightSum, curSum);
        }

        return Math.max(Math.max(maxSubArray(nums, left, mid - 1), maxSubArray(nums, mid + 1, right)), leftSum + nums[mid] + rightSum);
    }
}
