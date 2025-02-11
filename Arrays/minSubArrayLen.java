class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int cursum = 0;
        int mini = Integer.MAX_VALUE;
        for(int num = 0; num < n; num++){
            cursum += nums[num];
            while(cursum >= target){
                mini = Math.min(mini, num - left + 1);
                cursum -= nums[left];
                left++;
            }
        }
        return (mini == Integer.MAX_VALUE) ? 0: mini;
    }
}