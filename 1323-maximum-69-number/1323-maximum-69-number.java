class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='6') {
                return Integer.parseInt(sb.replace(i,i+1,"9").toString());
            }
        }
        return num;
    }
}