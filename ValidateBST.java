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
 * Space Complexity is O(N) where n is the height of tree
 * Time complexity is O(N) where n is the number of Nodes in the tree
 */
class Solution {
    TreeNode prev =null;
    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }
    
    private boolean inOrder(TreeNode root){
    
        if(root==null){
            return true;
        }
        
        boolean left=inOrder(root.left);
        if(left==false){
            return false;
        }
        if(prev!=null && prev.val>=root.val){
            return false;
        }
        prev=root;
        boolean right=inOrder(root.right);
        return right;
    }
}
