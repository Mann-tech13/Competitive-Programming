// class Solution {
//     public int orangesRotting(int[][] grid) {
//         Queue<int[]> queue = new LinkedList<>();
        
//         int time = 0;
//         int track_one = 0;
//         for(int i=0; i<grid.length; i++){
//             for(int j=0; j<grid[0].length; j++){
//                 if(grid[i][j] == 2){
//                     queue.add(new int[] {i, j});
//                 }
//                 else if(grid[i][j] == 1){
//                     track_one++;
//                 }
//             }
//         }
        
//         if(track_one == 0){
//             return track_one;
//         }
        
//         boolean check = false;
//         int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//         while(queue.size() > 0){
//             int[] visited = queue.remove();
//             for(int[] d: dirs){
//                 int x = visited[0] + d[0];
//                 int y = visited[1] + d[1];
                
//                 if( x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != 1 ){
//                     continue;
//                 }
//                 else{
//                     if(grid[x][y] == 1 && grid[visited[0]][visited[1]] == 2){
//                         System.out.print(x);
//                         System.out.println(", "+y);
//                         grid[x][y] = 2;
//                         queue.add(new int[] {x, y});
//                         track_one--;
//                         check = true;
//                     }
//                 }
//             }
//             if(check == true){
//                 time++;
//                 check = false;
//             }
//         }
//         return track_one == 0 ? time: -1;
//     }
// }


// // [[2,1,1],[1,1,0],[0,1,1]] -> 4 but 5
// // [[1,2]] -> 1 but 0

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque<>();
        if(grid == null) return -1;
        int freshOranges = 0;
        // get the list of rooten oranges so that BFS does not ends up in infinite loop
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == 2){
                    queue.offer(new Pair(row, col));
                }else if(grid[row][col] == 1){
                    freshOranges++;
                }
            }
        }
        //edge case when no fresh orange is present in grid
        if(freshOranges == 0) return 0;
        // test cases are written to start from -1 so used -1
        int timeElapsed = -1;
        while(!queue.isEmpty()){
            int n = queue.size();
           
            timeElapsed++;
            //below for loop is to limit the BFS loop to increment time per level of BBFS
            for(int i = 0; i < n; i++){
                Pair pair = queue.poll();
                int r = (int)pair.getKey();
                int c = (int)pair.getValue();
                int[][] directions = { {-1,0},{0,1},{1,0},{0,-1} };
                for(int dir = 0; dir < directions.length; dir++){
                    int newR = r + directions[dir][0];
                    int newC = c + directions[dir][1];
                    
                    if(newR >= 0 && newC >= 0 && newR < grid.length && newC < grid[newR].length){
                        // add only fresh oranges to be explore in queue to avoid infinite loop
                        if(grid[newR][newC] == 1){
                            freshOranges--;
                            queue.offer(new Pair(newR, newC));
                            grid[newR][newC] = 2;
                        }
                    }
                }
            }
            
        }
        //result
        return freshOranges == 0 ? timeElapsed : -1;
    }
}