class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] str_arr1 = s1.split(" ");
        String[] str_arr2 = s2.split(" ");
        
        for(int i=0; i<str_arr1.length; i++){
            if(map.containsKey(str_arr1[i])){
                map.put(str_arr1[i], map.get(str_arr1[i]) + 1);
            }
            else{
                map.put(str_arr1[i], 1);
            }
        }
        for(int i=0; i<str_arr2.length; i++){
            if(map.containsKey(str_arr2[i])){
                map.put(str_arr2[i], map.get(str_arr2[i]) + 1);
            }
            else{
                map.put(str_arr2[i], 1);
            }
        }
        List<String> list = new ArrayList<String>();
        for(Map.Entry mapEle : map.entrySet()){
            String key = (String)mapEle.getKey();
            int value = (int)mapEle.getValue();
            if(value == 1){
                list.add(key);
                // i++;
            }
        }
        String[] res = new String[list.size()];
        for(int i=0; i<res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}