class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int n = s.length();
        int x = 0;
        int e = 0;
        int ans = -1;
        Map<Character,Integer> map = new HashMap<>(); // char : count
        int uniqueCount = 0;
        while(e<n){
            if(!map.containsKey(s.charAt(e))){
                map.put(s.charAt(e),1 );
                uniqueCount++;
            } else {
                map.put(s.charAt(e), map.get(s.charAt(e))+1);
            }
            if(uniqueCount < k){
                e++;
            }
            else if(uniqueCount == k){
                ans = Math.max(ans, e-x+1);
                e++;
            } else{
                while(uniqueCount > k ){
                    map.put(s.charAt(x), map.get(s.charAt(x))-1);
                    if(map.get(s.charAt(x)) == 0) {
                        map.remove(s.charAt(x));
                        uniqueCount--;
                    }
                    x++;
                }
                e++;
            }
        }
        return ans;
    }
}
