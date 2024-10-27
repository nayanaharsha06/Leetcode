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
    int max_path_sum; // Keeps track of the maximum path sum found during traversal

    public int maxPathSum(TreeNode root) {
        max_path_sum = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
        pathSum(root); // Start the recursive function to calculate path sums, starting from the root
        return max_path_sum; // Return the maximum path sum found
    } 

    public int pathSum(TreeNode node) {
        if (node == null) {
            return 0; // If the current node is null, the path sum contribution is 0
        }

        // Recursively calculate the maximum path sum of the left and right subtrees
        // Ignore negative sums by using Math.max(0, ...)
        int left = Math.max(0, pathSum(node.left)); // Max sum from the left subtree
        int right = Math.max(0, pathSum(node.right)); // Max sum from the right subtree

        // Update max_path_sum with the maximum path sum passing through the current node
        max_path_sum = Math.max(max_path_sum, left + right + node.val);

        // Return the maximum path sum extending downwards from this node
        // This considers the node's value and the larger of the left or right subtree sums
        return Math.max(left, right) + node.val;
        //tells which path has higher value nd goes in tht path
    }
}

/*

You're right—this line might seem redundant at first glance because we are 
already updating max_path_sum with potential maximum values.
Purpose of return Math.max(left, right) + node.val;
While max_path_sum keeps track of the maximum path sum that could include 
paths crossing through the current node, the line return Math.max(left, right) + node.val; 
calculates the maximum sum of paths that extend downward from the current node. 
we are returning it to int pathSum
*/