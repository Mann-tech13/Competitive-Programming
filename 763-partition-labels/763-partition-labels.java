class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s.length() == 0 || s == null){
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        int[] last_occ = new int[26];
        for(int i=0; i<s.length(); i++){
            last_occ[s.charAt(i) - 'a'] = i;
        }
        // for(int i=0; i<last_occ.length; i++){
        //     System.out.println(last_occ[i]);
        // }
        int start = 0, end = 0;
        for(int i=0; i<s.length(); i++){
            end = Math.max(end, last_occ[s.charAt(i) - 'a']);
            if(i == end){
                list.add(end - start + 1);
                start = end + 1;
            }
        }
        return list;
    }
}