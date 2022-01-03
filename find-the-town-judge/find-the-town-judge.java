class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int track[] = new int[n+1];
        
        for(int t[] : trust){
            track[t[0]]--;     // outdegree
            track[t[1]]++;   // indegree
        }
        
        for(int i=1;i<=n;i++){
            if(track[i]==n-1){
                return i;
            }
        }
        
        return -1;
        
    }
}