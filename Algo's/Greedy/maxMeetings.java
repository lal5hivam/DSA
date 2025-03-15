class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    class Data{
        int s;
        int e;
        Data(int s,int e){
            this.s=s;
            this.e=e;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<Data> arr=new ArrayList<Data>();
        for(int i=0;i<start.length;i++){
            arr.add(new Data(start[i],end[i]));
        }
        arr.sort(Comparator.comparingInt(a->a.e));
        int count=1;
        int freetime=arr.get(0).e;
        for(int i=1;i<start.length;i++){
            if(arr.get(i).s>freetime){
                count++;
                freetime=arr.get(i).e;
            }
        }
        return count;
    }
}
