class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low++]=arr[mid];
                arr[mid++]=temp;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
    }
}
