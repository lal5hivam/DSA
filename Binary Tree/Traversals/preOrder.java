class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        preorder(root, node);
        return node;
    }

    private void preorder(TreeNode root, List<Integer> node) {
        if (root == null) {
            return;
        }
        node.add(root.val); 
        preorder(root.left, node); 
        preorder(root.right, node); 
    }
}
