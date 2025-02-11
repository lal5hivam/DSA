class Solution {
    public char kthCharacter(int k) {
        if (k == 1) {
            return 'a';
        }
        int prevLen = 1;
        while (true) {
            if (prevLen * 2 >= k) {
                break;
            }
            prevLen *= 2;
        }
        char c = kthCharacter(k - prevLen);
        return c < 'z' ? (char) (c + 1) : 'a';
    }
}
