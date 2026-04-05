package LeetCode;

import java.util.Scanner;

public class LeetCode70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the steps : ");
        int n = sc.nextInt();
        int k = climbStairs(n);
        System.out.println("The total ways to go is "+k);
    }
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

}
