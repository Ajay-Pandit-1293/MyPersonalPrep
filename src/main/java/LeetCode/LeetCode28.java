package LeetCode;

import java.util.Scanner;

public class LeetCode28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fucking string in which you want to check : ");
        String s = sc.nextLine();
        System.out.print("Enter the fucking string to check : ");
        String ss= sc.nextLine();
        Solution solution = new Solution();
        int count = solution.strStr(s,ss);
        System.out.println("Count is : "+count);;
    }

}



class Solution {
    public int strStr(String haystack, String needle) {
        int id=0;
        int result=-1;
        int counter=0;
        int finalcount=-1;
        for (int i=0;i<haystack.length();i++){
            if (haystack.charAt(i)==needle.charAt(id)){
                id++;
                if(haystack.charAt(i)==needle.charAt(0)){
                    counter=i;
                }

            }else{
                finalcount=-1;
            }
        }
        return finalcount;

    }
}
