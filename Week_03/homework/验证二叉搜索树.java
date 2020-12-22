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
     long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        return isValidBSTByMid(root);

    }

    private boolean isValidBSTByMid( TreeNode root ) {
        if(root ==null){
            return true;
        }
        boolean l = isValidBSTByMid(root.left);
        if(root.val <=pre){
            return  false;
        }
        pre = root.val;
        boolean r = isValidBSTByMid(root.right);
        return  l&&r;
    }
}