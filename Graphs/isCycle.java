// DFS approach

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}


// BFS approach

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            int pu = find(u, parent);
            int pv = find(v, parent);
            if (pu == pv) return true;
            union(pu, pv, parent);
        }
        return false;
    }
    private int find(int x, int[] parent) {
        if (parent[x] != x)
            parent[x] = find(parent[x], parent); // Path compression
        return parent[x];
    }

    private void union(int u, int v, int[] parent) {
        parent[u] = v;
    }
}

