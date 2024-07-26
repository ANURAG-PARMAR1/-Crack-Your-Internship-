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
    public int helper (TreeNode root,int[] maxD) {
        if(root == null) return 0;
       int localLeft = helper(root.left,maxD);
       int localRight =helper(root.right,maxD);
        maxD[0] = Math.max(maxD[0],localLeft+localRight);
       return 1+Math.max(localLeft ,localRight);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode temp = root;
        int []dm = new int[1];
        helper(temp,dm);
        return dm[0];

        
    }
}