class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1,i2)->Integer.compare(i1[0],i2[0]));
        
        List<int[]> ans=new ArrayList<>();
        ans.add(intervals[0]);  
        for(int[] interval:intervals){
            int[] temp=ans.get(ans.size()-1);
            if(interval[0]<=temp[1]){ 
                ans.add(new int[]{temp[0],Math.max(temp[1],interval[1])});
                ans.remove(ans.size()-2);
            }
            else{
                ans.add(interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}