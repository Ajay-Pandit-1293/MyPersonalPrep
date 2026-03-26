package LeetCode;

import java.util.Scanner;

// Adding a number without using the + or - operator

public class LeetCode371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the first number : ");
        int b = sc.nextInt();

        System.out.println("The Final Answer is : "+getSum(a,b));


    }

//    public static int getSum(int a, int b) {
//        String s = " ";
//        String ss = " ";
//        s=s.repeat(a);
//        ss=ss.repeat(b);
//        String sss = String.format("%s%s", s, ss);
//        return sss.length();
//    }

    public static int getSum(int a, int b) {

        if (a < 0 && b < 0) return -getSum(-a, -b);
        if (a < 0) return getSum(b, a);
        if (b < 0) {
            String s = " ".repeat(a);
            String ss = " ".repeat(-b);
            return s.length() - ss.length(); // a - |b|
        }


        String s  = " ".repeat(a);
        String ss = " ".repeat(b);
        String sss = String.format("%s%s", s, ss);
        return sss.length();
    }
}
