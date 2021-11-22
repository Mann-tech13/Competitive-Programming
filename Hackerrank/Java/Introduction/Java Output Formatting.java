import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            String[] strarr=new String[3];
            String[] arr=new String[3];
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                strarr[i]=s1;
                String sx=Integer.toString(x);
                arr[i]=sx;
                //Complete this line
            }
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                if(arr[i].length()==1){
                    arr[i]="00"+arr[i];
                    System.out.printf("%-14s %s\n",strarr[i],arr[i]);
                }
                else if(arr[i].length()==2){
                    arr[i]="0"+arr[i];
                    System.out.printf("%-14s %s\n",strarr[i],arr[i]);
                }
                else if(arr[i].length()==3){
                    System.out.printf("%-14s %s\n",strarr[i],arr[i]);
                }
            }
            System.out.println("================================");

    }
}



