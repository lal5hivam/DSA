
class Solution {
  public static int[] count_NGEs(int n, int arr[], int m, int indices[]) {
    // code here
     Stack<Integer> md = new Stack<>();
    Stack<Integer> ma = new Stack<>();
    int[] ngeCount = new int[n];
    
    for(int i=n-1; i>=0; i--) {
        while(!md.isEmpty() && md.peek() <= arr[i]) {
            ma.add(md.pop());
        }
        ngeCount[i] = md.isEmpty() ? 0 : md.size();
        md.add(arr[i]);
        while(!ma.isEmpty()) {
            md.add(ma.pop());
        }
    }
    
    int[] ans = new int[m];
    for(int i=0; i<m; i++) {
        ans[i] = ngeCount[indices[i]];
    }
    
    return ans;
  }
}
     
