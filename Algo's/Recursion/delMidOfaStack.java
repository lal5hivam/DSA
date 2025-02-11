
class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        if(s.size() == 1){
            s.pop();
            return;
        }
        int n = s.size();
        if(n % 2 == 0) n++;
        n/=2;
        solve(s, n, 0);
    }
    public void solve(Stack<Integer> s, int n, int i){
        if(i>=(n*2-1))
        {
            return;
        }
        if (n==i)
        {
            s.pop();
            solve(s,n,i+1);
        }
        else
        {
            int val=s.peek();
            s.pop();
            solve(s,n,i+1);
            s.push(val);
        }
    }
}
