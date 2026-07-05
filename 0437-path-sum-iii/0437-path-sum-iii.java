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
    HashMap<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {

        map.put(0L, 1);

        return dfs(root, 0L, targetSum);
    }

    private int dfs(TreeNode root, long currSum, int target) {

        if (root == null)
            return 0;

        currSum += root.val;

        int count = map.getOrDefault(currSum - target, 0);

        map.put(currSum,
                map.getOrDefault(currSum, 0) + 1);

        count += dfs(root.left, currSum, target);
        count += dfs(root.right, currSum, target);

        map.put(currSum, map.get(currSum) - 1);

        return count;
    }
}