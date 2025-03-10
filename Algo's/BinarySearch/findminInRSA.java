class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot == nums.length-1){
            return nums[0];
        }
        return nums[pivot+1];
    }

      public static int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;
        while(start<= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }

            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }

            if(nums[mid] >= nums[start]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
