class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<s.length(); i++){
            int len = i+10;
            if(len > s.length()){
                break;
            }
            String temp = s.substring(i, len);
            map.put(temp,map.getOrDefault(temp, 0)+1);
        }
        List<String> list = new ArrayList<String>();
        for(String key: map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;
    }
}