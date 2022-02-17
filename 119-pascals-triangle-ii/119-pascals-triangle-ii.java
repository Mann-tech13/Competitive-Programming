class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> pascal_triangle = new ArrayList();
        for(int i =0; i<= numRows;i++){
            List<Integer> list = new ArrayList();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    list.add(pascal_triangle.get(i-1).get(j-1) + pascal_triangle.get(i-1).get(j));
                }
            }
            
            pascal_triangle.add(list);
        }
        return pascal_triangle.get(pascal_triangle.size() - 1);
    }
}