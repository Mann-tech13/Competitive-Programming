class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,List<Character>> row = new HashMap<Integer,List<Character>>();
        HashMap<Integer,List<Character>> col = new HashMap<Integer,List<Character>>();
        
        int n=board.length;
        int m=board[0].length;
        
        /*1. Checking Row and Col*/
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='.') continue;
                
                if (row.containsKey(i) && row.get(i).contains(board[i][j]) || col.containsKey(j) &&col.get(j).contains(board[i][j])){
                    return false;                    
                }      
                
                List<Character> rowList = row.getOrDefault(i,new ArrayList<Character>());
                List<Character> colList = col.getOrDefault(j,new ArrayList<Character>());
                rowList.add(board[i][j]);
                colList.add(board[i][j]);
                row.put(i,rowList);
                col.put(j,colList);
            }
        }
        
        /**2 Checking 3*3 Box */
        for(int k=0;k<=6;k+=3){
            for(int l=0;l<=6;l+=3){
                Set<Character> set = new HashSet<Character>();
                for(int rowIndx=k;rowIndx<k+3;rowIndx++){
                    for(int colIndx=l;colIndx<l+3;colIndx++){
                        if(board[rowIndx][colIndx]=='.') continue;
                        
                        else if(set.contains(board[rowIndx][colIndx])){
                            return false;
                        }
                        set.add(board[rowIndx][colIndx]);
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}