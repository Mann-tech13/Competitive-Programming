class Solution {
    public int[] plusOne(int[] digits) {
       if(digits[digits.length - 1] <= 8){
            digits[digits.length - 1]++; 
            return digits;
        }
        else{
            int carry = 0;
            int sum = 1;
            for(int i = digits.length - 1; i >= 0; i--){
                sum = sum + digits[i] + carry;
                carry = sum/10;
                digits[i] = sum % 10;
                sum = 0;
            }
            if(digits[0] == 0){
                int[] result = new int[digits.length + 1]; 
                result[0] = 1;
                return result;
            }
            return digits;
        }
    }
}