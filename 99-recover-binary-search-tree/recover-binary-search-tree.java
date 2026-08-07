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
    private TreeNode f=null;
    private TreeNode s=null;
    private TreeNode p=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(f!=null && s!=null){
            int temp=f.val;
            f.val=s.val;
            s.val=temp;
        }
    }
    private void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        if(p!=null && p.val>node.val){
            if(f==null){
                f=p;
            }
            s=node;
        }
        p=node;
        inorder(node.right);
    }
}