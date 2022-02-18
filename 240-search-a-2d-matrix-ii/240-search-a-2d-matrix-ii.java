class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        boolean check = false;
        
//         bottom left corner is pivot
        
        while(i != -1 && j != matrix[0].length){
            if(target > matrix[i][j]){
                j++;
            }
            
            else if(target < matrix[i][j]){
                i--;
            }
            
            else if(target == matrix[i][j]){
                check = true;
                break;
            }
        }
        
        return check;
    }
}