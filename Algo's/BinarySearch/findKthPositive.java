class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, ryt = arr.length - 1, mid;
        while(left <= ryt){
            mid = left + (ryt-left)/2;
            if(arr[mid] - (mid + 1) < k) left = mid + 1;
            else ryt = mid - 1;
        }
        return k + left;
    }
}
