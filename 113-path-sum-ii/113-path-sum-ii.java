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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        pathSum(root, targetSum, ans, new ArrayList<>());
        return ans;
    }
    
    void pathSum(TreeNode root, int target, List<List<Integer>> ans, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(target == root.val) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(root.left != null){
            pathSum(root.left, target-root.val, ans, list);
            list.remove(list.size()-1);
        }
        if(root.right !=null){
            pathSum(root.right, target-root.val, ans, list);
            list.remove(list.size()-1);
        }
    }
}