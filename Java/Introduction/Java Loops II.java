import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result=0;
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result=a;
            for(int i=0; i<n; i++){
        
        
        
        
                result+=(Math.pow(2,i)*b);
    
                System.out.print(result+" ");
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
