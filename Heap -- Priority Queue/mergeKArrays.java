class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        class Pair implements Comparable<Pair>{
            int value;
            int row;
            int col;
            Pair(int value, int row, int col){
                this.value = value;
                this.row = row;
                this.col = col;
            }
            public int compareTo(Pair p2){
                return this.value - p2.value;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < K ; i++) pq.add(new Pair(arr[i][0], i, 0));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            res.add(current.value);
            
            if(current.col + 1 < K){
                pq.add(new Pair(arr[current.row][current.col+1], current.row, current.col+1));
            }
        }
        return res;
    }
}
