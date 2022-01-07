class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        else if(t.length() == 0){
            return false;
        }
        int count = 0;
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(count)){
                count++;
                if(count == s.length()){
                    break;
                }
            }
        }
        System.out.println(count);
        if(count == s.length()){
            return true;
        }
        return false;
    }
}