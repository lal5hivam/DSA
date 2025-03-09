class Solution {
    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    static String postToPre(String post_exp) {
        Stack<String> s = new Stack<String>();
        for (int i = 0; i < post_exp.length(); i++) {
            if (isOperand(post_exp.charAt(i))) {
                s.push(post_exp.charAt(i) + "");
            } else {
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = post_exp.charAt(i) + op2 + op1;
                s.push(temp);
            }
        }
        return s.peek();
    }
}
