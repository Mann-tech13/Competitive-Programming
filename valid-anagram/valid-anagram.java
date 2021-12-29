class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
        
        for(int i=0; i<s.length(); i++){
            if(hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
            }
            else{
                hashmap.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0; i<t.length(); i++){
            if(hashmap.containsKey(t.charAt(i))){
                hashmap.put(t.charAt(i),hashmap.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        
        for(Map.Entry<Character, Integer> entry: hashmap.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
            // System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        
        return true;
    }
}