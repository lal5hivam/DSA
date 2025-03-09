class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String>st=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                 st.push(Character.toString(c));
            }else{
                String op1=st.pop();
                String op2=st.pop();
                st.push(op1+op2+c);
            }
        }
        return st.pop();
    }
}
