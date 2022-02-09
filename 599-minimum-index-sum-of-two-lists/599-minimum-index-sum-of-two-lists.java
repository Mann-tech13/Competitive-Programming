class Solution {
    public String[] findRestaurant(String[] list1, String[] list2){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        
        int sum =0;
        int max = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        
        for(int j=0; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                sum = j+map.get(list2[j]);
                if(sum<max){
                    list.clear();
                    list.add(list2[j]);
                    max = sum;
                    
                }
                else if(sum==max){
                    list.add(list2[j]);
                }
            }            
        }
        return list.toArray(new String[list.size()]);
    }
}