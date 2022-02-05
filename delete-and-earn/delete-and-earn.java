class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        
        int len = nums.length;
        int[] track = new int[nums[len-1]+1];
        int[] exclude = new int[nums[len-1]+1];
        int[] include = new int[nums[len-1]+1];
        
        int lenMax = nums[len-1]+1;
        
        for(int i=0; i<len; i++){
            track[nums[i]] = ++track[nums[i]];
        }
        
        for(int i=1; i<lenMax; i++){
            include[i] = (i * track[i]) + exclude[i-1];
            exclude[i] = Math.max(exclude[i-1], include[i-1]);
            System.out.println(exclude[i]+" "+include[i]);
        }
        
        // for(int i=0; i<lenMax; i++){
        //     System.out.println(track[i]);
        // }
        return Math.max(include[lenMax-1], exclude[lenMax-1]);
    }
}