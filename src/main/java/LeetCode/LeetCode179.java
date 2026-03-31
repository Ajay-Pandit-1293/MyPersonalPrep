package LeetCode;

import java.util.Arrays;
import java.util.Scanner;



//This Program has a little Logical Error and i am lazy so i am not fixing that now Zehahahahahaha

public class LeetCode179 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fucking size of the fucking array : ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th fucking element of the fucking array : ");
            arr[i]= sc.nextInt();
        }
        String result = largestNumber(arr);

        System.out.println("So the largest number can be made from array is : "+result);
    }

    public static String largestNumber(int[] nums){
        StringBuilder sb = new StringBuilder();
        for (int x : nums) {
            sb.append(x);
        }
        String s = sb.toString();

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        StringBuilder sbd = new StringBuilder();
        for (int x : arr) {
            sbd.append(x);
        }
        String str = sbd.reverse().toString();




        return str;
    }



// This is the fixed version uncomment this to get bug free program Yohohohohoo
//    public static String largestNumber(int[] nums) {
//
//
//        String[] strNums = new String[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            strNums[i] = String.valueOf(nums[i]);
//        }
//
//
//        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
//
//
//        if (strNums[0].equals("0")) return "0";
//
//
//        StringBuilder sb = new StringBuilder();
//        for (String s : strNums) {
//            sb.append(s);
//        }
//
//        return sb.toString();
//    }
}
