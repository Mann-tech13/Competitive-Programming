class Solution {
    public int numSquares(int n) {
        int sqrt = (int)Math.sqrt(n);
        if(sqrt * sqrt == n){
            // System.out.println(sqrt);
            return 1;
        }
        if(n <= 3){
            return n;
        }
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        
        for(int i=4 ; i<=n ; i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=1 ; j*j <= i ; j++){
                dp[i]=Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        
        return dp[n];
    }
}