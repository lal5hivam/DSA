class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int left = findCeil(root.left, key);
        if(left!= -1) return left;
        if(root.data >= key) return root.data;
        int right = findCeil(root.right, key);
        if(left == -1 && right == -1) return -1;
        if(left == -1 )  return right ;
        return left;
    }
}
