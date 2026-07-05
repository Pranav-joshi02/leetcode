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
    private int check(TreeNode root, long target){
        if(root==null){return 0;}
        int count=0;
        if(root.val == target){
            count++;
        }
        count += check(root.left , target-root.val);
        count += check(root.right , target-root.val);

        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){return 0;}
        
       //check every node and its left and right subtree
        return check(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
}