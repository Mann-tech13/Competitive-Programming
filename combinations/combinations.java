class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        allcombinations(n, k, new ArrayList<>(), ans);
        return ans;
    }
    
    void allcombinations(int target, int capacity, List<Integer> store, List<List<Integer>> ans){
        if(capacity == 0){
            ans.add(new ArrayList<>(store));
        }
        
        for (int i = target; i >= 1; i--) {
            store.add(i);
            allcombinations(i - 1, capacity - 1, store, ans);
            store.remove(store.size() - 1);
        }
        
    }
    
}