class Solution {
     public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return 0;
        int cols = matrix[0].length;
        
        int[] heights = new int[cols + 1];
        int maxArea = 0;
        
        for (char[] row : matrix) {
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            
            for (int j = 0; j <= cols; j++) {
                if (j < cols && row[j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
                
                while (stack.size() > 1 && (j == cols || heights[j] < heights[stack.peek()])) {
                    int h = heights[stack.pop()];
                    int w = j - stack.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(j);
            }
        }
        
        return maxArea;
    }
}
