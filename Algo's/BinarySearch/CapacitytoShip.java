class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int weight:weights)
        {
            right+=weight;
            left=Math.max(left, weight);
        }
        while(left<=right)
        {
            int sum=0;
            int day=1;
            int mid=(left+right)/2;
            for(int weight:weights)
            {
                sum+=weight;
                if(sum>mid)
                {
                    day++;
                    sum=weight;
                    if(weight>mid) day=days+1; 
                }
            } 
            if(day<=days) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
