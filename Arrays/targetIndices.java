package Arrays;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) c++;
            if (n < target) lessthan++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}