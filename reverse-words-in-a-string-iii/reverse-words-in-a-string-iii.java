class Solution {
    public String reverseWords(String s) {

        String[] array = s.split(" ");
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<array.length; i++)
        {
            StringBuilder str = new StringBuilder(array[i]);
            ans.append(str.reverse().toString() + " ");
        }
        
        return ans.toString().strip();
    }
}