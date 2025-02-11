class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
            else{
                int j = map.get(nums[i]);
                if(Math.abs(i-j) <= k)
                    return true;
                else
                    map.put(nums[i], i);

            }
        }
        return false;
        
    }
}