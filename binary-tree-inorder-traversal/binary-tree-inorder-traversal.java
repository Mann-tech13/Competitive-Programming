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
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root, new ArrayList<>());
    }
    public List<Integer> inorderTraversal(TreeNode root, List<Integer> store_ele){
        if(root == null){
            return store_ele;
        }
        store_ele = inorderTraversal(root.left, store_ele);
        store_ele.add(root.val);
        return inorderTraversal(root.right, store_ele);
    }
}