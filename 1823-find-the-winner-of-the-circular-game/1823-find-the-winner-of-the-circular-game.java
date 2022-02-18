class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        while(list.size() > 1){
            int i = 1;
            while(i < k){
                int remove = list.remove(0);
                list.add(remove);
                i++;
            }
            list.remove(0);
        }
        return list.get(0);
    }
}