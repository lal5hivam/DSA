class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefsum = 0;

        HashMap<Integer, Integer> prefmap = new HashMap<>();
        prefmap.put(0, 1);

        for(int num : nums){
            prefsum = prefsum + num;

            int mod = prefsum % k;

            if(mod < 0){
                mod = mod + k;
            }

            if(prefmap.containsKey(mod)){
                count = count + prefmap.get(mod);
                prefmap.put(mod, prefmap.get(mod) + 1);
            } else { 
                prefmap.put(mod, 1);
            }
        }

        return count;
    }
}