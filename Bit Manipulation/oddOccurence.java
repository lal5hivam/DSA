class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        int xor=0;
        for(int i:Arr){
            xor^=i;
        }
        int rightMost=((xor&xor-1)^xor);
        int b1=0, b2=0;
        for(int i:Arr){
            if((i&rightMost)!=0){
                b1^=i;
            }else{
                b2^=i;
            }
        }
        int a=(b1>b2)?b1:b2;
        int b=(b1<b2)?b1:b2;
        return new int[]{a,b};
    }
}
