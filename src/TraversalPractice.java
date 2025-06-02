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

        //create variable to hold the sum
        int total = 0;

   

        //This checks for leaf nodes because we know leaf nodes do not have anymore nodes to go to
        if (node.left == null && node.right == null) {
            total+=node.data;
        }

        total += sumLeafNodes(node.left);

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
        //create a variable to store count
        int count = 0;

        //check if null then return 0
        if(node == null) return 0;

        //recursion using size()
        //if statment to count if it is a node
        if(node != null){
            count++;
        }

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
        //create a branch count varaible
        int branchCountVariable = 0;

        //check if null then return 0
        if(node == null) return 0;

        //if statement to check whether it is a branch node and increment
        //recursion
        if (node.left != null || node.right != null) {
            branchCountVariable++;
        }
        branchCountVariable += branchCount(node.left);

        branchCountVariable += branchCount(node.right);

        return branchCountVariable;
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
        //If the input node is null, returns Integer.MIN_VALUE.
        if (node == null) return Integer.MIN_VALUE;

        //create a variables storing max
        int max = node.data;
        int maxLeft = max(node.left);
        int maxRight = max(node.right);


        //use some sort of if statement to compare
        if (maxLeft > max) {
            max = maxLeft;
        }
        if (maxRight > max) {
            max = maxRight;
        }

        return max;
    }
}
