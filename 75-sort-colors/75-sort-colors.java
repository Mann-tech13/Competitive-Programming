class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1) return;

        int[] array = new int[3];

        for(int i = 0; i < nums.length; i++){
            int ele = nums[i];

            if(ele==0){
                array[0]++;
            }
            else if(ele==1){
                array[1]++;
            }
            else{
                array[2]++;
            }
        }

        int ele = 0;
        for(int i = 0; i < 3; i++){
            while(array[i] > 0){
                nums[ele] = i;
                array[i]--;
                ele++;
            }
        }
    }
}
