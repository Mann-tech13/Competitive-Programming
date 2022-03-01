class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[1];
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        for(int i=1; i<n+1; i++){
            nums[i] = nums[i/2] + i%2;
        }
        return nums;
    }
}