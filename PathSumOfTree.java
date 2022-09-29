//https://leetcode.com/problems/path-sum/

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        
            return treeSearch(root,targetSum,sum);
    }
    
    public boolean treeSearch(TreeNode root, int targetSum,int sum) {
        
        
        if(root != null){
            sum+=root.val;     
            if(root.left == null && root.right==null){
                if(sum == targetSum){
                    return true;
                }        
            return false;
            }
         return treeSearch(root.left, targetSum,sum) || treeSearch(root.right,targetSum,sum);        
        }
        else{  
            return false;
        }
        
    }
}