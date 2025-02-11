class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int left = 1,ryt = m;
        while(left <= ryt){
            int mid = left + (ryt - left)/2;
            int num = pow(mid, n);
            if(num == m) return mid;
            else if(num < m) left = mid + 1;
            else ryt = mid - 1;
        }
        return -1;
    }
    public int pow(int x,int y){
        if(y == 1) return x;
        return x*pow(x, y-1);
    }
}
