class NumArray {
    int[] prefsum;
    public NumArray(int[] nums) {
        prefsum = nums;
        for(int i = 1; i < prefsum.length; i++){
            prefsum[i] = nums[i] + nums[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return prefsum[right];
        else return prefsum[right] - prefsum[left - 1];
    }
}
