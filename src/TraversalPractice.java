public class TraversalPractice {
    /**
     * Returns the sum of the leaf nodes in a tree.
     * 
     * If the input node is null, returns 0
     * 
     * Example:
     * 
     *              9
     *             / \
     *            2   5
     *           / \   \
     *          7   1   3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *          6      0    77
     *         
     * 
     * Output: 92 (The leaf nodes sum as 6 + 1 + 8 + 0 + 77)
     * 
     * @param node the root of the tree
     * @return the sum of the leaf node values
     */
    public static int sumLeafNodes(TreeNode node) {
        if (node == null) return 0;
        int total = node.data;
        total += sumLeafNodes(node.left) + sumLeafNodes(node.right);
        return total;
    }

    /**
     * Returns the total count of nodes in the tree.
     * 
     * If the input node is null, returns 0.
     * 
     * Example:
     * 
     *              9
     *             / \
     *            2   5
     *           / \   \
     *          7   1   3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *          6      0    77
     *         
     * 
     * Output: 12 (there are 12 nodes in the tree)
     * 
     * @param node the root of the tree
     * @return the number of nodes in the tree
     */
    public static int size(TreeNode node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }

    /**
     * Returns the count of branch nodes in the tree.
     * 
     * If the input node is null, returns 0.
     * 
     * Example:
     * 
     *              9
     *             / \
     *            2   5
     *           / \   \
     *          7   1   3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *          6      0    77
     *         
     * 
     * Output: 7 (There are seven branch nodes: 9, 2, 7, 4, 5, 3, and 33)
     * 
     * @param node the root of the tree
     * @return the count of branch nodes in the tree
     */
    public static int branchCount(TreeNode node) {
        if (node == null) return 0;
        total = branchCount(node.left) + branchCount(node.right);
    }


    /**
     * Returns the maximum value in the tree.
     * 
     * If the input node is null, returns Integer.MIN_VALUE.
     * 
     * Example:
     * 
     *              9
     *             / \
     *            2   5
     *           / \   \
     *          7   1   3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *          6      0    77
     *         
     * 
     * Output: 77
     * 
     * @param node the root of the tree
     * @return the count of branch nodes in the tree
     */
    public static int max(TreeNode node) {
        return Integer.MIN_VALUE;
    }
}
