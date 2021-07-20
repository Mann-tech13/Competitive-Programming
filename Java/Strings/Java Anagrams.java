import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        char[] arrayA=a.toCharArray();
        char[] arrayB=b.toCharArray();
        char temp='a';
        boolean result=true;
        
        if(a.length()!=b.length()){
            result=false;
        }
        else{
            // Arrays.sort(arrayA);
            // Arrays.sort(arrayB);
            
            for(int i = 0; i <arrayA.length; i++) {     
                for(int j = i+1; j <arrayA.length; j++) {     
                    if(arrayA[i] >arrayA[j]) {      //swap elements if not in order
                        temp = arrayA[i];    
                        arrayA[i] = arrayA[j];    
                        arrayA[j] = temp;    
                    }     
                }     
            }    
            
            for(int i = 0; i <arrayA.length; i++) {     
                for(int j = i+1; j <arrayA.length; j++) {     
                    if(arrayB[i] >arrayB[j]) {      //swap elements if not in order
                        temp = arrayB[i];    
                        arrayB[i] = arrayB[j];    
                        arrayB[j] = temp;    
                    }     
                }     
            }
            
            for(int i=0; i<a.length(); i++){
                if(arrayA[i]!=arrayB[i]){
                    result=false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
