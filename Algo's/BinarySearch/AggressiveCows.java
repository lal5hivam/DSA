class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int ans = -1;
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1, ryt = (stalls[n - 1] - stalls[0]);
        
        while(left <= ryt){
            int mid = (left + ryt)/2;
            if(possible(stalls, mid, k) == true) left = mid + 1;
            else ryt = mid - 1;
        }
        return ryt;
    }
    public static boolean possible(int[] stalls, int dis, int cows){
        int count = 1, last = stalls[0];
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - last >= dis){
                count++;
                last = stalls[i];
            }
            if(count >= cows) return true;
        }
        return false;
    }
}
