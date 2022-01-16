class Solution {
    public boolean exist(char[][] board, String word) {
        
        char[] words = word.toCharArray();
        
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean ans = dfs(board, i, j, words, 0);
                    if(ans)
                        return true;
                }
            }
        return false;
    }
    
    public boolean dfs(char[][] board, int i, int j, char[]words, int idx)
    {
        if(idx == words.length)
            return true;
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != words[idx])
            return false;
        
        char temp = board[i][j];
        board[i][j] = '0';
        
        boolean left  = dfs(board, i, j-1, words, idx+1);
        boolean right = dfs(board, i, j+1, words, idx+1);
        boolean up    = dfs(board, i-1, j, words, idx+1);
        boolean down  = dfs(board, i+1, j, words, idx+1);
        
        if(left || right || up || down){
            return true;
        }
        
        board[i][j] = temp;
        
        return false;
    }
}