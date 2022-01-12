class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        int count = 0, track = 1; 
        int[] temp = new int[score.length];
        String[] ans = new String[score.length];
        
        for(int i=0; i<score.length; i++){
            temp[i] = score[i];
        }
        
        Arrays.sort(temp);
        
        for(int i=score.length-1; i>=0; i--){
            if(track <= 3){
                if(track == 1){
                    map.put(temp[i], "Gold Medal");
                }
                else if(track == 2){
                    map.put(temp[i], "Silver Medal");
                }
                else if(track == 3){
                    map.put(temp[i], "Bronze Medal");
                }
                track++;
            }
            else{
                map.put(temp[i], String.valueOf(score.length-i));
            }
        }
        for(int i=0; i<score.length; i++){
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}