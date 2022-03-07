import java.util.Map.Entry;  
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        
        List<Entry<Character,Integer>> freq = new ArrayList<Entry<Character,Integer>>(map.entrySet());
        
        Collections.sort(freq,new Comparator<Entry<Character,Integer>>(){
           public int compare(Entry<Character,Integer> o1 , Entry<Character,Integer> o2){
               return o2.getValue().compareTo(o1.getValue());
           } 
        });
        
        // System.out.println(freq);
        for(Entry<Character,Integer> entry : freq){
            int val = entry.getValue();
            while(val > 0){
                sb.append(entry.getKey());
                val--;
            }
        }
        
        return sb.toString();
    }
}