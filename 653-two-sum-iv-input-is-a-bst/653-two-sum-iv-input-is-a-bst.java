class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        if(root==null) {
            return false;
        }
        
        List<Integer> list = new ArrayList<>();
        TreeToList(root,list);
        
        int i=0;
        int j=list.size()-1;
        
        while(i<j) {
            if(list.get(i)+list.get(j)<k) {
                i++;
            } 
            else if(list.get(i)+list.get(j)>k) {
                j--;
            } 
            else {
                return true;
            }
        }
        return false;
    }
    
    void TreeToList(TreeNode root, List<Integer> list) {
        if(root==null) {
            return;
        }       
        TreeToList(root.left,list);
        list.add(root.val);
        TreeToList(root.right,list);
        
    }
}