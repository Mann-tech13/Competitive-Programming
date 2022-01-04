class Solution {
    public int climbStairs(int n) {
       int stair_value[]=new int[n+1];
        stair_value[0]=1;
        stair_value[1]=1;
        
        if(n>=2){
            for(int i=2;i<=n;i++){
                stair_value[i]=stair_value[i-1]+stair_value[i-2];
            }    
        }
        
        
        return stair_value[n];
    }
}