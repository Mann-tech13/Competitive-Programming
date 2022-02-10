class Solution {
    public int coinChange(int[] coins, int amount) {
        int totalCoins = coins.length;
        int[][] dp = new int[totalCoins+1][amount+1];
        
        for(int i=0; i<totalCoins+1; i++){
            for(int j=0; j<amount+1; j++){
                if(i == 0 && j != 0){
                    dp[i][j] = amount + 1;
                }
                if(i != 0 && j == 0){
                    dp[i][j] = 0;
                }
                if(i != 0 && j != 0){
                    if(coins[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
                    }
                }
            }
        }
        
        return dp[totalCoins][amount] > amount ? -1 : dp[totalCoins][amount];
    }
}