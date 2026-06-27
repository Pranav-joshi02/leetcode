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
//     private boolean dfs(TreeNode root) {
//     if (root == null) {
//         return true;
//     }

//     if (root.left != null && root.right != null) {
//         return false;
//     }

//     return dfs(root.left) && dfs(root.right);
// }
//     public int rob(TreeNode root) {
       
//         if(root==null){return 0;}
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         int evenSum=0;
//         int oddSum=0;
//         boolean isEven=false;
//         while(!queue.isEmpty()){
//             if(dfs(root)){
//                 int special=0;
//             while(!queue.isEmpty()){
//                 TreeNode current = queue.poll();
//                 if(current.left != null){queue.offer(current.left);}
//                 if(current.right != null){queue.offer(current.right);}
//                 special +=current.val; 
//             }
//             return  special;

//             }
            
           
//             int level=queue.size();
//             for(int i =0; i<level ; i++){
//                 TreeNode current = queue.poll();
//                 if(current.left != null){queue.offer(current.left);}
//                 if(current.right != null){queue.offer(current.right);}
//                 if(isEven){evenSum+=current.val;}
//                 else {oddSum+=current.val;}
//             }
//             isEven = !isEven;
//         }
//         return (evenSum > oddSum) ? evenSum : oddSum;
//     }
private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int rob = root.val + left[1] + right[1];

        int notRob = Math.max(left[0], left[1]) +
                     Math.max(right[0], right[1]);

        return new int[]{rob, notRob};
    }

    public int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }
}