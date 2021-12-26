class Solution {
    public void reverseString(char[] s) {
        Character[] temp = new Character[s.length];
        
        for(int i = s.length - 1; i >= 0; i--){
            temp[s.length - i - 1] = s[i];
            // System.out.println(temp[s.length - i - 1]);
        }
        for(int i = 0; i < s.length; i++){
            s[i] = temp[i];
            // System.out.println(s[i]);
        }
    }
}