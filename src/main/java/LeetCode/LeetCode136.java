package LeetCode;

import java.util.Scanner;

public class LeetCode136 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr[i] = sc.nextInt();
        }
        int k = singleNumber(arr);
        System.out.println("THe Single number in the arrray is : "+ k);
    }

    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int k : nums) n^=k;
        return n;
    }
}
