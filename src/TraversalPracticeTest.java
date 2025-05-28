import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TraversalPracticeTest {

    /**
     * Tree:
     *          9
     *         / \
     *        2   5
     *       / \   \
     *      7   1   3
     *     /       / \
     *    4       8  33
     *     \      /  \
     *      6    0    77
     */
    @Test
    public void testSampleTree() {
        TreeNode root = new TreeNode(9,
            new TreeNode(2,
                new TreeNode(7,
                    new TreeNode(4, null, new TreeNode(6)),
                    null
                ),
                new TreeNode(1)
            ),
            new TreeNode(5,
                null,
                new TreeNode(3,
                    new TreeNode(8),
                    new TreeNode(33, new TreeNode(0), new TreeNode(77))
                )
            )
        );
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(92, result); // 6 + 1 + 8 + 0 + 77
    }

    /**
     * Tree:
     *     42
     */
    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(42);
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(42, result);
    }

    /**
     * Tree:
     *     1
     *    /
     *   2
     */
    @Test
    public void testLeftOnlyChild() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(2, result);
    }

    /**
     * Tree:
     *   1
     *    \
     *     3
     */
    @Test
    public void testRightOnlyChild() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(3, result);
    }

    /**
     * Tree: null (empty tree)
     */
    @Test
    public void testNullInput() {
        int result = TraversalPractice.sumLeafNodes(null);
        assertEquals(0, result);
    }

    /**
     * Tree:
     *   1
     *    \
     *     2
     *      \
     *       3
     */
    @Test
    public void testRightChain() {
        TreeNode root = new TreeNode(1, null,
            new TreeNode(2, null,
                new TreeNode(3)
            )
        );
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(3, result);
    }

    /**
     * Tree:
     *       10
     *      /  \
     *     5    15
     *         /  \
     *        12   20
     */
    @Test
    public void testMultipleLeavesMixed() {
        TreeNode root = new TreeNode(10,
            new TreeNode(5),
            new TreeNode(15,
                new TreeNode(12),
                new TreeNode(20)
            )
        );
        int result = TraversalPractice.sumLeafNodes(root);
        assertEquals(5 + 12 + 20, result);
    }
}
