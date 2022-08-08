class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        boolean check = true;
        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(t.charAt(i) != map.get(s.charAt(i))){
                    check = false;
                    break;
                }
            }
            else{
                if(set.contains(t.charAt(i))){
                    check = false;
                    break;
                }
                
                map.put(s.charAt(i), t.charAt(i));
            }
            set.add(t.charAt(i));
        }
        
        
        return check;
    }
}