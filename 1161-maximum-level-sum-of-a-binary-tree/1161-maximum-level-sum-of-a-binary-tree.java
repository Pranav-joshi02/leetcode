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
    
    public int maxLevelSum(TreeNode root) {
        if (root==null){return 0;}


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max=Integer.MIN_VALUE;
         int answer=1;
          int levelno=1;
        while(!queue.isEmpty()){
        
        int level=queue.size();
       
       
        int sum=0;
        for(int i=0;i<level;i++){
            TreeNode current=queue.poll();
            sum +=current.val;
            if(current.left!=null){queue.offer(current.left);}
            if(current.right!=null){queue.offer(current.right);}
        }
       if(sum>max){
        max=sum;
        answer=levelno;
       }
       levelno++;
        }
        return answer;
    }
}