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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        if(root==null) {return list;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
         
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int level=queue.size();
           
            for(int i =0; i<level;i++){
                TreeNode current = queue.poll();
                if(current.left !=null){
                    queue.offer(current.left);
                }
                if(current.right !=null){
                    queue.offer(current.right);
                }
                
                max=Math.max(max,current.val);
            }
            
            list.add(max);
        }
        return list;
    }
}