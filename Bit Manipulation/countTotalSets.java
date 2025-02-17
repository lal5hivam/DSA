class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        if(n == 0) return 0;
        int count = 0;
        for(int i = 1; i <= n; i++){
            while(i > 0){
                i = i & (i - 1);
                count++;
            }
        }
        return count;
    }
}
