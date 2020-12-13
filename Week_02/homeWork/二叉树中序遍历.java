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
   //ÖÐÐò±éÀú
    public  List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        mid(root,list);
        return list;

    }

    private  void mid(TreeNode root, ArrayList<Integer> list) {
        if(root == null){
            return;
        }
        mid(root.left,list);
        list.add(root.val);
        mid(root.right,list);

    }
}