class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(List<Integer> edge: edges){
            map.put(edge.get(1), map.getOrDefault(edge.get(1), 0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}