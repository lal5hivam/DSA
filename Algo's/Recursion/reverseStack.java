
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()) return;
        int el = s.pop();
        reverse(s);
        insert(s, el);
        return;
    }
    public static void insert(Stack<Integer> s, int el){
        if(s.isEmpty()){
            s.push(el);
            return;
        }
        int temp = s.pop();
        insert(s, el);
        s.push(temp);
        return;
    }
}
