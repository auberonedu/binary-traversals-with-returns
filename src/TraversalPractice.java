public class TraversalPractice {
    /**
     * Returns the sum of the leaf nodes in a tree.
     * 
     * If the input node is null, returns 0
     * 
     * Example:
     * 
     * 9
     * / \
     * 2 5
     * / \ \
     * 7 1 3
     * / / \
     * 4 8 33
     * \ / \
     * 6 0 77
     * 
     * 
     * Output: 92 (The leaf nodes sum as 6 + 1 + 8 + 0 + 77)
     * 
     * @param node the root of the tree
     * @return the sum of the leaf node values
     */
    public static int sumLeafNodes(TreeNode node) {
        if (node == null)
            return 0;

        int sum = 0;
        if (node.left == null && node.right == null) {
            sum += node.data;
        }
        sum += sumLeafNodes(node.left);
        sum += sumLeafNodes(node.right);

        return sum;
    }

    /**
     * Returns the total count of nodes in the tree.
     * 
     * If the input node is null, returns 0.
     * 
     * Example:
     * 
     * 9
     * / \
     * 2 5
     * / \ \
     * 7 1 3
     * / / \
     * 4 8 33
     * \ / \
     * 6 0 77
     * 
     * 
     * Output: 12 (there are 12 nodes in the tree)
     * 
     * @param node the root of the tree
     * @return the number of nodes in the tree
     */
    public static int size(TreeNode node) {
        if (node == null)
            return 0;

        int count = 0;

        if (node != null) {
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
     * 9
     * / \
     * 2 5
     * / \ \
     * 7 1 3
     * / / \
     * 4 8 33
     * \ / \
     * 6 0 77
     * 
     * 
     * Output: 7 (There are seven branch nodes: 9, 2, 7, 4, 5, 3, and 33)
     * 
     * @param node the root of the tree
     * @return the count of branch nodes in the tree
     */
    public static int branchCount(TreeNode node) {
        if (node == null)
            return 0;

        int count = 0;
        if (node.left != null || node.right != null) {
            count++;
        }
        count += branchCount(node.left);
        count += branchCount(node.right);

        return count;
    }

    /**
     * Returns the maximum value in the tree.
     * 
     * If the input node is null, returns Integer.MIN_VALUE.
     * 
     * Example:
     * 
     * 9
     * / \
     * 2 5
     * / \ \
     * 7 1 3
     * / / \
     * 4 8 33
     * \ / \
     * 6 0 77
     * 
     * 
     * Output: 77
     * 
     * @param node the root of the tree
     * @return the count of branch nodes in the tree
     */
    public static int max(TreeNode node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int max = node.data;
        int leftMax = max(node.left);
        int rightMax = max(node.right);

        if (leftMax > max)
            max = leftMax;
        if (rightMax > max)
            max = rightMax;

        return max;

    }
}
