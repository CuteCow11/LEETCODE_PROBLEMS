/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<>();
        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int s, int e) {
        List<TreeNode> allTrees = new ArrayList<>();

        if (s > e) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = s; i <= e; i++) {
            List<TreeNode> ls = buildTrees(s, i - 1);
            List<TreeNode> rs = buildTrees(i + 1, e);
            for (TreeNode l : ls) {
                for (TreeNode r : rs) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    allTrees.add(root);
                }
            }
        }
        return allTrees;
    }
}