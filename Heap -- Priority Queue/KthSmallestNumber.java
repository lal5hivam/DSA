class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> que = new PriorityQueue();
       for(int i : arr){
           que.add(i);
       }
       for (int i = 0 ; i< k-1 ;++i){
           que.remove();
       }
       return que.peek();
    }
}
