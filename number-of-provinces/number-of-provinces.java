class Solution {
    
    void DFS(int[][] isConnected, int rowEle, int row){
        if(isConnected[rowEle][rowEle] == 0){
            return;
        }
        for(int i=0; i<row; i++){
            if(isConnected[rowEle][i] == 1){
                isConnected[rowEle][i] = 0;
                DFS(isConnected, i, row);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int row = isConnected.length;
        int count = 0;
        for(int i=0; i<row; i++){
            if(isConnected[i][i] == 1){
                count++;
                DFS(isConnected, i, row);
            }
        }
        return count;
    }
}