class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = timeSeries.length;
        
        if(len == 1){
            return duration;
        }
        int res = 0;
        for(int i=1; i<len; i++){
            if(timeSeries[i] - timeSeries[i-1] >= duration){
                res = res + duration;
            }
            else{
                res = res + timeSeries[i] - timeSeries[i-1];
            }
        }
        return res+duration;
    }
}