class Solution {
    boolean[] vis;
    public void dfs(int node, ArrayList<ArrayList<Integer>> g) {
        vis[node] = true;
        for (int neighbor : g.get(node)) {
            if (!vis[neighbor]) dfs(neighbor, g);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        vis = new boolean[n];
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) 
            g.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isConnected[i][j] == 1 && i != j) g.get(i).add(j);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(!vis[i]) {
                dfs(i, g);
                count++;
            }
        }
        return count;
    }
}
