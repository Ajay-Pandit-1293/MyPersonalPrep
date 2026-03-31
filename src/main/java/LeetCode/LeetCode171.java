package LeetCode;

import java.util.Scanner;

public class LeetCode171 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Column Number in Alphabetic format to get Corresponding Numeric number : ");
        String s = sc.nextLine();
        if (!s.matches("[a-zA-Z]+")) {
            System.out.println("Wrong Input! Another Disappointment ,I told you to only enter the " +
                    "Alphabetic format,  Fuck You Man! Terminating...");
            System.exit(0);
        }
        int k=titleToNumber(s);
        System.out.println("The result is : "+k);
    }


    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int sum=0;
        for (int i = 0;i<n;i++){
            int a = (int)(columnTitle.charAt(i)-64);
            int mul = a*(int)Math.pow(26,(n-1-i));
            sum = sum + mul;
        }
        return sum;
    }
}
