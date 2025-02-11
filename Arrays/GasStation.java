class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = 0;
        int totalLeft = 0;
        int currLeft = 0;
        for (int i = 0; i < gas.length; i++) {
            totalLeft += gas[i] - cost[i];
            currLeft += gas[i] - cost[i];
            if (currLeft < 0) {
                currLeft = 0;
                result = i + 1;
            }
        }
        if (totalLeft < 0) {
            return -1;
        } else {
            return result;
        }
    }
}
