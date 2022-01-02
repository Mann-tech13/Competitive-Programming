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
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(root, new ArrayList<>());
    }
    public List<Integer> postorderTraversal(TreeNode root, List<Integer> store_ele){
        if(root == null){
            return store_ele;
        }
        store_ele = postorderTraversal(root.left, store_ele);
        store_ele = postorderTraversal(root.right, store_ele);
        store_ele.add(root.val);
        return store_ele;
    }
}