class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=1;
        int start_index=0, end_index=0;
        
        if(s.length()==0){
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        
        while(end_index < s.length()) {
            
            if(set.contains(s.charAt(end_index))){
                int size = end_index - start_index;
                max = Math.max(size, max);
                set.remove(s.charAt(start_index));
                start_index++;
            } 
            else{
                set.add(s.charAt(end_index));
                end_index++;
            }
        }
        
        int size = end_index - start_index;
        return Math.max(size, max);
    }
}