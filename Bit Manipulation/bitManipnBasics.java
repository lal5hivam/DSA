class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int x = 1 << (i-1);
        if((num & x) == 0) System.out.print(0 + " " + (num|x) + " " + (num));
        else System.out.print(1 + " " + (num) + " " + (num^x));
    }
}
