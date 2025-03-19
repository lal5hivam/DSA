class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while(!queue.isEmpty()){
            length = queue.size();
            List<Integer> sub = new ArrayList<>(length);
            for(int i=0;i<length;i++){
                TreeNode top = queue.poll();
                sub.add(top.val);
                if(top.left!=null){
                    queue.offer(top.left);
                }
                if(top.right!=null){
                    queue.offer(top.right);
                }
            }
            ans.add(sub);
        }
        return ans; 

    }
}
