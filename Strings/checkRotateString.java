class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        s += s;
        if(s.contains(goal)) return true;
        else return false;
    }
}
