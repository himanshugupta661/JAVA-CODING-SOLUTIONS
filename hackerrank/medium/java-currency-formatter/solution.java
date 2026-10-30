import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        

Locale usLocale = Locale.US;
Locale indiaLocale = new Locale("en", "IN");
Locale chinaLocale = Locale.CHINA;
Locale franceLocale = Locale.FRANCE;

String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);
String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);
String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);

india = india.replace("\u20B9", "Rs.");
china = china.replace("CN\u00A5", "\u00A5");

// Fix currency symbols and formatting

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
