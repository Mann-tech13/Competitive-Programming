class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        
        for(int[] p: pieces){
            map.put(p[0], p);
        }
        
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int[] p = map.get(arr[i]);
                for(int num: p){
                    if(num == arr[i]){
                        // System.out.println(i);
                        i++;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
            i--;
        }
        return true;
    }
}