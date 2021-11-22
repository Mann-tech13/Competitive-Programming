import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale indiaLocale = new Locale("en", "IN");
        
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = formatterUS.format(payment);
        String india = formatterIndia.format(payment);
        String china = formatterChina.format(payment);
        String france = formatterFrance.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
