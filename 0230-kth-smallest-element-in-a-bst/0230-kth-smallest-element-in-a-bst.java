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
    int answer=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
      if(root == null || k==0) return 0;
      kthSmallest(root.left,k);
      count++;
      if( k == count) answer = root.val;
      kthSmallest(root.right,k);
      return answer;
    }
}