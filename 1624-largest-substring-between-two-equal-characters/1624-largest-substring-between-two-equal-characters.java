class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        for(int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
            // System.out.println(lastIndex[s.charAt(i) - 'a']);
        }
        int max = -1;
        for(int i=0; i<s.length(); i++){
            int saved = s.charAt(i) - 'a';
            if(lastIndex[saved] != -1 && lastIndex[saved] != i){
                max = Math.max(max, lastIndex[saved] - i - 1);
            }
        }
        return max;
    }
}