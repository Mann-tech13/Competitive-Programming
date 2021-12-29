class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        floodFill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    void floodFill(int[][] image, int sr, int sc, int originalcolor, int newColor){
        if( sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalcolor ){
            return;
        }
        image[sr][sc] = newColor;
        floodFill(image, sr-1, sc, originalcolor, newColor);
        floodFill(image, sr+1, sc, originalcolor, newColor);
        floodFill(image, sr, sc-1, originalcolor, newColor);
        floodFill(image, sr, sc+1, originalcolor, newColor);
    }
}