class Solution {
    public int findComplement(int num) {
        StringBuffer sb = new StringBuffer();
        int id = 0;
 
        while (num > 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        String str = sb.reverse().toString();
        String s1 = str.replace("1", "2");
        String s2 = s1.replace('0', '1');
        String s3 = s2.replace('2', '0');
        
        // System.out.println(s3);
        int ans = 0;
        for(int i=0; i<s3.length(); i++){
            ans += Math.pow(2, i) * (s3.charAt(s3.length()-1 - i) - '0');
        }
        return ans;
//         char[] arr = new char[sb.size()];
        
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sb.charAt(i);
//             if(arr[i] = '0'){
//                 arr[i] = '1';
//             }
//         }
        
        
    }
}