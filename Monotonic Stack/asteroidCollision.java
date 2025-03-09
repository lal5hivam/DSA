class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i: asteroids){
            while(!st.empty() && i<0 && st.peek()>0){
                int diff = st.peek() + i;
                if(diff<0) st.pop();
                else if(diff>0) i = 0; 
                else{
                    i=0;
                    st.pop();
                }
            }
            if(i!=0) st.push(i);
        }
        return st.stream().mapToInt(i -> i).toArray();
    }
}
