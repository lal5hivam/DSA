class Solution {
    public static int floor(Node root, int x) {
       if(root==null) return -1;
       if(root.data > x)
       return floor(root.left,x);
       if(root.data<x){
           int possibleFloor=root.data;
           int exactMatch=floor(root.right,x);
           if(exactMatch==-1)
           return possibleFloor;
           else
           return exactMatch;
       }
       return root.data;
    }
}
