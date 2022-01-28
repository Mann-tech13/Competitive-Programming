class Solution {
    static int romanToInt(String s) {
        int num = 0;
        int change = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(change>=getNum(s.charAt(i))){
                num = num+getNum(s.charAt(i));
            }else{
                num = num+getNum(s.charAt(i))-2*change;
            }
            change = getNum(s.charAt(i));
        }
        return num;
    }
    static int getNum(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}