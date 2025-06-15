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
        if (node == null){
            return 0;
        }

        // If the node is a leaf node, return its value
        if(node.left == null && node.right == null) {
            return node.data;
        }

        // Recursively calculate the sum of leaf nodes in the left and right subtrees
        int lefSum = sumLeafNodes(node.left);
        int rightSum = sumLeafNodes(node.right);

        // Return the total sum of leaf nodes
        return lefSum + rightSum;

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
        int count = 0;

        if(node == null) {
            return 0;
        }

        // Count the current node and recursively count the nodes in the left and right subtrees
        int leftCount = size(node.left);
        int rightCount = size(node.right);

        // total count of nodes
        count = 1 + leftCount + rightCount;

        // Return 
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

        int count = 0;

        if(node == null){
            return 0;
        }

        // If the node is a leaf node, it is not a branch node so return 0
        if(node.left == null && node.right == null){
            return 0;
        }

        // Count the current node as a branch node and recursively count the branch nodes in the left and right subtrees
        int leftBranchCount = branchCount(node.left);
        int rightBranchCount = branchCount(node.right);

        // Return the total count of branch nodes
        count = 1 + leftBranchCount + rightBranchCount;
        
        // Return
        return count;
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

        int maximum = 0;

        if (node == null) {
            return Integer.MIN_VALUE;
        }

        // Get the maximum value from the left and right subtrees
        int leftMax = max(node.left);
        int rightMax = max(node.right);

        // Maximum value among the current node's value, left subtree's max, and right subtree's max
        maximum = Math.max(node.data, Math.max(leftMax, rightMax));

        // Return the maximum value
        return maximum;
    
      
    }
}
