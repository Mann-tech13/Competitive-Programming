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
class BSTIterator {

    TreeNode node;
    Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        this.node = root;
        this.stack = new Stack<>();
    }
    
    public int next() {
        if (hasNext()) {
            //get next value
            TreeNode cur = stack.pop();
            //prepare for next fetch
            node = cur.right;
            
            return cur.val;
        }
        
        return -1;
    }
    
    public boolean hasNext() {
        //prepare, get to the first valid place
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        
        return !stack.empty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */