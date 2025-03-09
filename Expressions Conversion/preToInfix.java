class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        StringBuffer pre = new StringBuffer(pre_exp);
        pre = pre.reverse();
        Stack<String> stack = new Stack<>();
        
        for(char c : pre.toString().toCharArray()){
            if(Character.isLetter(c)){
                stack.push(Character.toString(c));
            }
            else{
                String B = stack.pop();
                String A = stack.pop();
                String newString = ")"+A+c+B+"(";
                stack.push(newString);
            }
        }
        StringBuffer sb = new StringBuffer(stack.pop());
        return sb.reverse().toString();
    }
}
