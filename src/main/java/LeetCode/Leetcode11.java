package LeetCode;

import java.util.Scanner;

public class Leetcode11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element :");
            arr[i]=sc.nextInt();
        }
        int result = maxArea(arr);
        System.out.println(result);
    }

    public static int maxArea(int[] height){
     int count=0;
     int left=0;
     int right=0;
     int leftindex =0;
     int rightindex=height.length-1;
     while (leftindex<rightindex){
         int diff = rightindex-leftindex;
         int h;
         if(height[leftindex]>height[rightindex]){
            h=height[rightindex];
         }else{
             h=height[leftindex];
         }
         if(count<(h*diff)){
             count=h*diff;
         }
         if(height[leftindex]<height[rightindex]){
             leftindex++;
         }else{
             rightindex--;
         }
     }
     return count;
    }
}
