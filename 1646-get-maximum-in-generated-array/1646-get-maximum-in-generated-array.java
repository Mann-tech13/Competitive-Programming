class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2){
            return n;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        // int max = 1;
        for(int i=2; i<n+1; i++){
            nums[i] = i%2 == 0 ? nums[i/2] : nums[i/2] + nums[(i/2)+1];
            // max = Math.max(max, nums[i]);
        }
        Arrays.sort(nums);
        return nums[n];
    }
}