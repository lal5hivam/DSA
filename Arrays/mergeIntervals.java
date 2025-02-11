class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        int res[] = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= res[1]){
                if(res[1] < intervals[i][1]){
                    res[1] = intervals[i][1];
                }
            }else{
                result.add(res);
                res = intervals[i];
            }
        }
        
        result.add(res);
        return result.toArray(new int[result.size()][]);
    }
}