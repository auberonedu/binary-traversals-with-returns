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

        // initiate total as 0
        int total = 0;

        // if statement for only leaf nodes and save that data into total
        if (node.left == null && node.right == null){
        total = node.data;
        }

        // add nodes into total
        total +=sumLeafNodes(node.left);
        total += sumLeafNodes(node.right);

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
    
        // initiate count
        int count = 0;

        //when node != null, count will add 1
        count += 1;

        // add on subtree nodes to count
        count += size(node.left);
        count += size(node.right);

        return count;
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

        // initiate count
        int count = 0;

        // if statement to check if left node or right node is not null, then we add 1 to count
        if (node.left != null || node.right != null){
            count++;
        }

        // add count from subtree
        count += branchCount(node.left);
        count += branchCount(node.right);

        return count;

        // solution 2:
        // if (node == null || (node.left == null && node.right == null)) return 0;
        // return 1 + branchCount(node.left) + branchCount(node.right);

        // solution 3:
        //return node == null || (node.left == null && node.right == null) ? 0 : 1 + branchCount(node.left) + branchCount(node.right);
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
        if (node == null) return Integer.MIN_VALUE;

        // initiate the current max as the root data
        int currentMax = node.data;

        // get the max of the left subtree
        int leftMax = max(node.left);

        // get the max of the right subtree
        int rightMax = max(node.right);

        // compare each max subtree with the current max
        currentMax = Math.max(currentMax, leftMax);
        currentMax = Math.max(currentMax, rightMax);

        return currentMax;
    }
}
