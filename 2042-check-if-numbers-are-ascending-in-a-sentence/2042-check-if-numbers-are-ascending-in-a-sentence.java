class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str = s.split(" ");
        int value = -1;
        for(int i=0; i<str.length; i++){
            try{
                int temp = Integer.parseInt(str[i]);
                if(temp > value){
                    value = temp;
                }
                else{
                    return false;
                }
            }
            catch(NumberFormatException e){
                continue;
            }
        }
        return true;
    }
}