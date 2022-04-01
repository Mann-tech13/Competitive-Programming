class Solution {
    public void reverseString(char[] s) {
        int right = s.length;
        int left = 0;
        int mid = right/2;
        right--;
        while(left < mid){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}