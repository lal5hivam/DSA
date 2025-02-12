import java.util.ArrayList;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int x : arr){
            sum += x;
            max = Math.max(max, x);
        }
        int ans = -1;
        int left = max, ryt = sum;
        while(left <= ryt){
            int mid = left + (ryt - left)/2;
            int stu = alloc(arr, n, mid);
            if(stu <= m){
                ans = mid;
                ryt = mid - 1;
            } else left = mid + 1;
        }
        return ans;
    }
    public static int alloc(ArrayList<Integer> arr, int n, int mid){
        int stu = 1, load = 0;
        for(int x : arr){
            if(x + load > mid){
                load = x;
                stu++;
            }else load += x;
        }
        return stu;
    }
}
