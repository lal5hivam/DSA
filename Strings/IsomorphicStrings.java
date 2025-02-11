class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        Arrays.fill(mapST, -1);
        Arrays.fill(mapTS, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            
            if (mapST[cS] == -1 && mapTS[cT] == -1) {
                mapST[cS] = cT;
                mapTS[cT] = cS;
            } else {
                if (mapST[cS] != cT || mapTS[cT] != cS) {
                    return false;
                }
            }
        }
        return true;
    }
}
