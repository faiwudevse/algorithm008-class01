class Solution {
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> inMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inMap = new HashMap();
        this.preorder = preorder;
        this.inorder = inorder;

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode result = buildTree(0, preorder.length -1, 0, inorder.length - 1);
        return result;
    }

    public TreeNode buildTree(int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preStart + 1, preStart + numsLeft, inStart, inRoot - 1);
        root.right = buildTree(preStart + numsLeft + 1, preEnd, inRoot + 1, inEnd);

        return root;
    }
}