package LeetCode;

import java.util.Scanner;

public class LeetCode125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check : ");
        String s = sc.nextLine();
        Solution2 solution2 = new Solution2();
        boolean  b =solution2.isPalindrome(s);
        System.out.println("The answer is : "+b);
    }
}

class Solution2 {
    public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sb.append(ch);
                }
            }
            String str = sb.toString();
            char[] arr = str.toCharArray();
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return str.equals(new String(arr));
        }
    }