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
        
        // check to see if the root is null or not (empty tree)
        if (root == null) {
            return false;
        }

        // subtract the current value of the root from the sum we're looking for
        targetSum = targetSum - root.val;

        // if we're at a leaf, return the boolesn value of whether or not the targetSum is 0 or not
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // traverse the left or right side until we get till targetSum = 0
        return hasPathSum(root.right, targetSum) || hasPathSum(root.left, targetSum);

    }
}