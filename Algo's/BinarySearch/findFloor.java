class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        
        while(l <= r){
            int mid =l + (r - l)/2;
            if(arr[mid] <= k){
                ans = mid;
                l = mid + 1;
            }else r = mid-1;
        }
        return ans;
    }
}

