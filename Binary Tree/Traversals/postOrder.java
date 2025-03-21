class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }  
    private void postorder(TreeNode root, List<Integer> result) {
        if (root != null) {
            postorder(root.left, result);
            postorder(root.right, result);
            result.add(root.val);
        }
    }
}
