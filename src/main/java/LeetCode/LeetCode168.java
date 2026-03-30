package LeetCode;

import java.util.Scanner;

public class LeetCode168 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Column Number to get the corresponding Alphabetic format : ");
        int n = sc.nextInt();
        String k=convertToTitle(n);
        System.out.println("The result is : "+k);
    }
    public static String convertToTitle(int columnNumber) {
        String s ="";
        while(columnNumber>0){
            columnNumber--;
            int r = columnNumber%26;
            s=s+(char)(65+r);
            columnNumber /=26;
        }

        String str= new StringBuilder(s).reverse().toString();
        return str;
    }
}


