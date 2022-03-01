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
    int index = -1;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return createTree(preorder, inorder, 0, preorder.length-1);
    }
    TreeNode createTree(int[] preorder, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }
        
        int data = preorder[index];
        index++;
        TreeNode root = new TreeNode(data);
        int k = -1;
        
        for(int i=start; i<=end; i++){
            if(data == inorder[i]){
                k = i;
                break;
            }
        }
        
        root.left = createTree(preorder, inorder, start, k-1);
        root.right = createTree(preorder, inorder, k+1, end);
        
        return root;
    }
}
