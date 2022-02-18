class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        int open = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                open++;
            }
            else if(ch == ')'){
                if(open == 0){
                    continue;
                }
                open--;
            }
            sb.append(ch);
        }
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '(' && open > 0){
                open--;
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
}