class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        //code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        while(head.prev!=lastNode && head!=lastNode){
            if(head.data+lastNode.data==target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(head.data);
                ans.add(lastNode.data);
                lastNode=lastNode.prev;
                head=head.next;
                list.add(ans);
            }else if(head.data+lastNode.data>target){
                lastNode=lastNode.prev;
            }else{
                head=head.next;
            }
            
        }
        return list;
    }
}
        
