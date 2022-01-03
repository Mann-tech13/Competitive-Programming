class Solution {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> list = new LinkedList<>();
        list.add(s);
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                int size = list.size();
                while(size > 0){
                    String str = list.poll();
                    String left = str.substring(0, i);
                    String right = str.substring(i+1, s.length());
                    list.add(left + Character.toLowerCase(ch) + right);
                    list.add(left + Character.toUpperCase(ch) + right);
                    size--;
                }
            }
        }
        return list;
    }
}