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
    private List<Integer> check(TreeNode root ,List<Integer> list ){
        if(root==null){return list;}
        if(root.left==null && root.right==null){list.add(root.val);}
        check(root.left ,list);
        check(root.right ,list);
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        return check(root1,new ArrayList<>()).equals(check(root2,new ArrayList<>()));
    }
}