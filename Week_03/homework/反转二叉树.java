/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
      //终止条件
        if(root==null){
            return  null;
        }
        //逻辑处理
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        //传递下一层
        invertTree(root.left);
        invertTree(root.right);
        //reverse status -- 不需要
        return  root;
    }
}