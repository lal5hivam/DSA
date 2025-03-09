public class Solution {
     public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
                Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            while (!st.isEmpty() && st.peek() >= A.get(i)) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result.add(st.peek());
            } else {
                result.add(-1);
            }

            st.push(A.get(i));
        }

        return result;
    
    }
}
