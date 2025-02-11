
// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
         int start = 0;
        int end = arr.size()-1;
        int count =0; 
        while(start<end){
            if(arr.get(start)>arr.get(end)){
                count++;
                start++;
            }else{
                end--;
            }
        }
        return count;
    }
}
