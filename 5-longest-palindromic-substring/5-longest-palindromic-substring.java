class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }
        else{
            int start = 0, end = 0;
            for(int i=0; i<s.length(); i++){
                int iniLength = LogicBeginFromMiddle(s, i, i);
                int finLength = LogicBeginFromMiddle(s, i, i+1);
                int len = Math.max(iniLength, finLength);
                if(len > end - start){
                    start = i - ((len - 1)/2);
                    end = i + (len/2);
                }
            }
            return s.substring(start, end + 1);
        }
    }
    int LogicBeginFromMiddle(String s, int leftPtr, int rightPtr){
        if(s == null || leftPtr > rightPtr ){
            return 0;
        }
        else{
            while(leftPtr>=0 && rightPtr<s.length() && s.charAt(leftPtr)==s.charAt(rightPtr)){
                leftPtr--;
                rightPtr++;
            }
            return rightPtr - leftPtr - 1;

        }
    }
}