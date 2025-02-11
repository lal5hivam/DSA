
class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux){
        // Your code here
        if(n==0)return 0;
        return 1+ towerOfHanoi(n-1, from, aux, to) + towerOfHanoi(n-1, aux, to, from);
    }
}
