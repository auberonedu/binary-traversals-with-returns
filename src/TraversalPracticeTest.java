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
    public void testSampleTree_sumLeafNodes() {
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
        assertEquals(92, TraversalPractice.sumLeafNodes(root));
    }

    /**
     * Tree:
     *     42
     */
    @Test
    public void testSingleNode_sumLeafNodes() {
        TreeNode root = new TreeNode(42);
        assertEquals(42, TraversalPractice.sumLeafNodes(root));
    }

    /**
     * Tree:
     *     1
     *    /
     *   2
     */
    @Test
    public void testLeftOnlyChild_sumLeafNodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertEquals(2, TraversalPractice.sumLeafNodes(root));
    }

    /**
     * Tree:
     *   1
     *    \
     *     3
     */
    @Test
    public void testRightOnlyChild_sumLeafNodes() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        assertEquals(3, TraversalPractice.sumLeafNodes(root));
    }

    /**
     * Tree: null (empty tree)
     */
    @Test
    public void testNullInput_sumLeafNodes() {
        assertEquals(0, TraversalPractice.sumLeafNodes(null));
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
    public void testRightChain_sumLeafNodes() {
        TreeNode root = new TreeNode(1, null,
            new TreeNode(2, null,
                new TreeNode(3)
            )
        );
        assertEquals(3, TraversalPractice.sumLeafNodes(root));
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
    public void testMultipleLeavesMixed_sumLeafNodes() {
        TreeNode root = new TreeNode(10,
            new TreeNode(5),
            new TreeNode(15,
                new TreeNode(12),
                new TreeNode(20)
            )
        );
        assertEquals(5 + 12 + 20, TraversalPractice.sumLeafNodes(root));
    }

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
    // @Test
    // public void testSampleTree_size() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null, new TreeNode(6)),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5,
    //             null,
    //             new TreeNode(3,
    //                 new TreeNode(8),
    //                 new TreeNode(33, new TreeNode(0), new TreeNode(77))
    //             )
    //         )
    //     );
    //     assertEquals(12, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree:
    //  *     42
    //  */
    // @Test
    // public void testSingleNode_size() {
    //     TreeNode root = new TreeNode(42);
    //     assertEquals(1, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree:
    //  *     1
    //  *    /
    //  *   2
    //  */
    // @Test
    // public void testLeftOnlyChild_size() {
    //     TreeNode root = new TreeNode(1, new TreeNode(2), null);
    //     assertEquals(2, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     3
    //  */
    // @Test
    // public void testRightOnlyChild_size() {
    //     TreeNode root = new TreeNode(1, null, new TreeNode(3));
    //     assertEquals(2, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree: null (empty tree)
    //  */
    // @Test
    // public void testNullInput_size() {
    //     assertEquals(0, TraversalPractice.size(null));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     2
    //  *      \
    //  *       3
    //  */
    // @Test
    // public void testRightChain_size() {
    //     TreeNode root = new TreeNode(1, null,
    //         new TreeNode(2, null,
    //             new TreeNode(3)
    //         )
    //     );
    //     assertEquals(3, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree:
    //  *       10
    //  *      /  \
    //  *     5    15
    //  *         /  \
    //  *        12   20
    //  */
    // @Test
    // public void testMultipleLeavesMixed_size() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(5),
    //         new TreeNode(15,
    //             new TreeNode(12),
    //             new TreeNode(20)
    //         )
    //     );
    //     assertEquals(5, TraversalPractice.size(root));
    // }

    // /**
    //  * Tree:
    //  *          9
    //  *         / \
    //  *        2   5
    //  *       / \   \
    //  *      7   1   3
    //  *     /       / \
    //  *    4       8  33
    //  *     \      /  \
    //  *      6    0    77
    //  */
    // @Test
    // public void testSampleTree_branchCount() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null, new TreeNode(6)),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5,
    //             null,
    //             new TreeNode(3,
    //                 new TreeNode(8),
    //                 new TreeNode(33, new TreeNode(0), new TreeNode(77))
    //             )
    //         )
    //     );
    //     assertEquals(7, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree:
    //  *     42
    //  */
    // @Test
    // public void testSingleNode_branchCount() {
    //     TreeNode root = new TreeNode(42);
    //     assertEquals(0, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree:
    //  *     1
    //  *    /
    //  *   2
    //  */
    // @Test
    // public void testLeftOnlyChild_branchCount() {
    //     TreeNode root = new TreeNode(1, new TreeNode(2), null);
    //     assertEquals(1, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     3
    //  */
    // @Test
    // public void testRightOnlyChild_branchCount() {
    //     TreeNode root = new TreeNode(1, null, new TreeNode(3));
    //     assertEquals(1, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree: null (empty tree)
    //  */
    // @Test
    // public void testNullInput_branchCount() {
    //     assertEquals(0, TraversalPractice.branchCount(null));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     2
    //  *      \
    //  *       3
    //  */
    // @Test
    // public void testRightChain_branchCount() {
    //     TreeNode root = new TreeNode(1, null,
    //         new TreeNode(2, null,
    //             new TreeNode(3)
    //         )
    //     );
    //     assertEquals(2, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree:
    //  *       10
    //  *      /  \
    //  *     5    15
    //  *         /  \
    //  *        12   20
    //  */
    // @Test
    // public void testMultipleLeavesMixed_branchCount() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(5),
    //         new TreeNode(15,
    //             new TreeNode(12),
    //             new TreeNode(20)
    //         )
    //     );
    //     assertEquals(2, TraversalPractice.branchCount(root));
    // }

    // /**
    //  * Tree:
    //  *          9
    //  *         / \
    //  *        2   5
    //  *       / \   \
    //  *      7   1   3
    //  *     /       / \
    //  *    4       8  33
    //  *     \      /  \
    //  *      6    0    77
    //  */
    // @Test
    // public void testSampleTree_max() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null, new TreeNode(6)),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5,
    //             null,
    //             new TreeNode(3,
    //                 new TreeNode(8),
    //                 new TreeNode(33, new TreeNode(0), new TreeNode(77))
    //             )
    //         )
    //     );
    //     assertEquals(77, TraversalPractice.max(root));
    // }

    // /**
    //  * Tree:
    //  *     42
    //  */
    // @Test
    // public void testSingleNode_max() {
    //     TreeNode root = new TreeNode(42);
    //     assertEquals(42, TraversalPractice.max(root));
    // }

    // /**
    //  * Tree:
    //  *     1
    //  *    /
    //  *   2
    //  */
    // @Test
    // public void testLeftOnlyChild_max() {
    //     TreeNode root = new TreeNode(1, new TreeNode(2), null);
    //     assertEquals(2, TraversalPractice.max(root));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     3
    //  */
    // @Test
    // public void testRightOnlyChild_max() {
    //     TreeNode root = new TreeNode(1, null, new TreeNode(3));
    //     assertEquals(3, TraversalPractice.max(root));
    // }

    // /**
    //  * Tree: null (empty tree)
    //  */
    // @Test
    // public void testNullInput_max() {
    //     assertEquals(Integer.MIN_VALUE, TraversalPractice.max(null));
    // }

    // /**
    //  * Tree:
    //  *   1
    //  *    \
    //  *     2
    //  *      \
    //  *       3
    //  */
    // @Test
    // public void testRightChain_max() {
    //     TreeNode root = new TreeNode(1, null,
    //         new TreeNode(2, null,
    //             new TreeNode(3)
    //         )
    //     );
    //     assertEquals(3, TraversalPractice.max(root));
    // }

    // /**
    //  * Tree:
    //  *       10
    //  *      /  \
    //  *     5    15
    //  *         /  \
    //  *        12   20
    //  */
    // @Test
    // public void testMultipleLeavesMixed_max() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(5),
    //         new TreeNode(15,
    //             new TreeNode(12),
    //             new TreeNode(20)
    //         )
    //     );
    //     assertEquals(20, TraversalPractice.max(root));
    // }


    // /**
    //  * Tree:
    //  *       -19
    //  *       /  \
    //  *     -51  -15
    //  *         /  \
    //  *       -3   -20
    //  *         \
    //  *         -8
    //  */
    // @Test
    // public void testNegative_max() {
    //     TreeNode root = new TreeNode(-19,
    //         new TreeNode(-51),
    //         new TreeNode(-15,
    //             new TreeNode(-3, null, new TreeNode(-8)),
    //             new TreeNode(-20)
    //         )
    //     );
    //     assertEquals(-3, TraversalPractice.max(root));
    // }
}
