class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.get(triangle.size() - 1).size()];
        int idx = 0;
        for (int num : triangle.get(triangle.size() - 1)) {
            dp[idx++] = num;
        }
        
        int size = triangle.size() - 2;
        while(size >= 0) {
            List<Integer> row = triangle.get(size);
            for (int i = 0; i < row.size(); i++) {
                dp[i] = Math.min(dp[i] + row.get(i), row.get(i) + dp[i + 1]);
            }
            size--;
        }
        
        return dp[0];
    }
}