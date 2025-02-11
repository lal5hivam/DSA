
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(!s.isEmpty()){
            int temp = s.peek();
            s.pop();
            sort(s);
            insert(s, temp);
        }
        
        return s;
        // add code here.
    }
    public void insert(Stack<Integer> s, int temp){
        if(s.isEmpty() || s.peek() <= temp){
            s.push(temp);
            return;
        }
        int temp2 = s.pop();
        insert(s, temp);
        s.push(temp2);
    }
}
