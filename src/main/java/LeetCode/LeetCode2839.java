package LeetCode;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class LeetCode2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String of length 4 only : ");
        String s1=sc.nextLine();
        System.out.print("Enter the Second String of length 4 only : ");
        String s2 =sc.nextLine();

        if(s1.length()>4 || s2.length()>4){
            System.out.println("I told you to enter the string of length 4 only , now the program " +
                    "is terminated , Fuck You Man , You are a disappointment !");
        }else {
            Solution3 s = new Solution3();
            boolean b = s.canBeEqual(s1, s2);
            if (b) {
                System.out.println("The Strings will be equal if we perform some operations on it " +
                        "according to the rules of the questions !");
            } else {
                System.out.println("The String will not be equal even in million years by the rules of " +
                        "the questions !");
            }
        }
    }
}

class Solution3 {
    public boolean canBeEqual(String s1, String s2) {
        return isPermutation(s1.charAt(0), s1.charAt(2), s2.charAt(0), s2.charAt(2))
                && isPermutation(s1.charAt(1), s1.charAt(3), s2.charAt(1), s2.charAt(3));
    }
    private boolean isPermutation(char a, char b, char c, char d) {
        return (a == c && b == d) || (a == d && b == c);
    }
}






//
//This is my approach to solve it but is has some issues only 963 case pass by it. The good
//        approach is written above , below approach can be used on some questions where there is no
//boundation of constraints;
//class Solution {
//    public boolean canBeEqual(String s1, String s2) {
//        for (int i = 0;i<s1.length()-2;i++){
//            if((s1.charAt(i)!=s2.charAt(i) && s1.charAt(i)!=s2.charAt(i+2)) ){
//                return false;
//            }
//        }
//        return true;
//    }
//}