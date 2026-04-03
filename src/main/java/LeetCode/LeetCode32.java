package LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class LeetCode32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the parentheses to check longest valid (only parentheses ):");
        String s = sc.nextLine();
       for (int i = 0;i<s.length();i++){
            if(s.charAt(i)!='('&&s.charAt(i)!=')'){
                System.out.println("I told you to enter only parentheses but you didn't follow " +
                        "the instructions ,\n Fuck You Man ! You're an another disappointment" +
                        " Now the program is terminated!! \nOne more thing that Make sure that idiots like" +
                        " you never run this program again.");
                System.exit(0);
            }
        }
        int count = longestValidParentheses(s);

        System.out.println("The Longest valid parentheses lenght is : "+count);
    }
    public static int longestValidParentheses(String s) {



            if (s == null || s.isEmpty()) return 0;

            Stack<Integer> stack = new Stack<>();
            stack.push(-1);  // base index

            int maxLen = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();

                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }

            return maxLen;








//        Stack<Character> stack = new Stack<>();
//        int count=0;
//        if(s==null){
//            return 0;
//        }
//        for (int i = 0;i<s.length();i++){
//            if (s.charAt(i)=='('){
//                stack.push(s.charAt(i));
//            }else if(s.charAt(i)==')'){
//                stack.pop();
//                count+=2;
//            }
//        }
//
//        return count;
    }
}





