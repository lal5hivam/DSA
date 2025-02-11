class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = max(piles);
        int low = 1, high = max;
        while(low<=high){
            int mid = (high + low)/2;
            int total = func(piles, mid);
            if(total <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public static int func(int[] piles, int hourly){
        int total = 0;
        for(int n : piles) total += Math.ceil((double)n / (double)hourly);
        return total;
    }
    public static int max(int[] piles){
        int max = 0;
        for(int n : piles)  max = Math.max(n, max);
        return max;
    }
}
