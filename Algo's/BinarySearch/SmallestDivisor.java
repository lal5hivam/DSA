class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low = 1, high = nums[nums.length - 1], ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(func(nums, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
    public static int func(int[] nums, int div){
        int sum = 0;
        for(int n : nums) sum += Math.ceil((double)n / (double)div);
        return sum;
    }
}
