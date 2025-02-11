

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        return uppBound(arr, target) - lowBound(arr, target);
    }
    public int lowBound(int[] arr, int target){
        
        int res = arr.length;
        
        int left = 0, ryt = arr.length - 1;
        
        while(left <= ryt) {
            int mid = left + (ryt - left) / 2;
            if(arr[mid] >= target){
                res = mid;
                ryt = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    public int uppBound(int[] arr, int target){
        int res = arr.length;
        
        int left = 0, ryt = arr.length - 1;
        
        while(left <= ryt){
            int mid = left + (ryt - left)/2;
            if(arr[mid] > target){    
                res = mid;
                ryt = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    
}
