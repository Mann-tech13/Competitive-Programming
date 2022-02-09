class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length, ans = 0;
        int dp[][] = new int[row][col];   
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = (matrix[i][j]-'0');;
                        // (matrix[i][j]-'0');
                }
                else {
                    if(matrix[i][j] == '0'){
                        dp[i][j] = 0;
                    }
                    else {
                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1]);
                    }
                }
                if(ans < dp[i][j]){
                    ans=dp[i][j];
                }
            }
        }
        return ans*ans;
    }
}