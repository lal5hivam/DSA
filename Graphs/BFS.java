class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean visited [] = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>(); 
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){            
           int node = q.poll();
           res.add(node);
           for(int n: adj.get(node)){
               if(!visited[n]){
                   visited[n] = true;
                   q.offer(n);
               }
           }
        }
        return res;
    }
}
