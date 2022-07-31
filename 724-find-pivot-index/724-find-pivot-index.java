class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int sum = 0;
        
        for(int i=1; i<len; i++){
            left[i] = left[i-1] + nums[i-1];
            // System.out.println(left[i]);
        }
        for(int i=len-2; i>=0; i--){
            right[i] = right[i+1] + nums[i+1];
            // System.out.println(right[i]);
        }
        for(int i=0; i<len; i++){
            if(left[i] == right[i]){
                return i;    
            }           
        }
        return -1;
    }
}