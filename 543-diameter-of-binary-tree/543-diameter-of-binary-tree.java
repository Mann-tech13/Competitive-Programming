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
    
    int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calc(root);
        return maxDiameter;
    }
    int calc(TreeNode n) {
        if (n == null) {
            return -1;
        }
        int leftHeight = calc(n.left);
        int rightHeight = calc(n.right);
        if (leftHeight + rightHeight + 2 > maxDiameter) {
            maxDiameter = leftHeight + rightHeight + 2;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

}