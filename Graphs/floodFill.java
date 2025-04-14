class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc])
            return image;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    void dfs(int[][] image,int i,int j,int color,int val)
    {
        if(i<0 || j<0 || i==image.length || j==image[0].length || image[i][j]!=val)
            return;

        image[i][j]=color;
        dfs(image,i+1,j,color,val);
        dfs(image,i-1,j,color,val);
        dfs(image,i,j+1,color,val);
        dfs(image,i,j-1,color,val);
    }
}
