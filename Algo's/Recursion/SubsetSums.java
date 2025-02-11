class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        solve(0, sum, list, arr);
        return list;
    }
    
    public void solve(int i, int sum, ArrayList<Integer> list, int[] arr){
        if(i == arr.length){
            list.add(sum);
            return;
        }
        solve(i+1, sum + arr[i], list, arr);
        solve(i+1, sum, list, arr);
        
        return;
    }
}
