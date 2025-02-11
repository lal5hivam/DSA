class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;
        int ans = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int citation = 0;
            for (int i : citations) {
                if (middle <= i) {
                    citation++;
                }
            }
            if (citation >= middle) {
                ans = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return ans;
    }
}
