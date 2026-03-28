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
        s=s.toLowerCase();
        String temp = s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)<'a' || s.charAt(i)>'z'){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }

        String str = sb.toString();
        String temp1=str;
        char [] arr = str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char ch = arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        String ori = new String(arr);

        if (ori.equals(temp1)){
            return true;
        }
        return false;
    }
}
