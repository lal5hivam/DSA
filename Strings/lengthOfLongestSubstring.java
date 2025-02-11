class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int count = 0;
        HashSet<Character> cset = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            while(cset.contains(s.charAt(r))){
                cset.remove(s.charAt(l));
                l++;
            }
            cset.add(s.charAt(r));
            count = Math.max(count, r - l + 1);
        }
        return count;
    }
}