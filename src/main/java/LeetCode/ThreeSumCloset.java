package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element :");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Target :");
        int t= sc.nextInt();
        int result = threeSumClosest(arr,t);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] nums , int target){
        int result=0;
        int currentsum =0;

        int diff=Integer.MAX_VALUE;
        int diff2=Integer.MAX_VALUE;
        int sum= nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i =0;i<nums.length-2;i++){
            int left= i+1;
            int right=nums.length-1;
            while (left<right){
                currentsum =nums[i]+nums[left]+nums[right];
                diff = Math.abs(target - currentsum);
                diff2=Math.abs(target - sum);
                if(diff<diff2){
                    sum= currentsum;
                }

                if (currentsum<target){
                    left++;
                } else if (sum>target) {
                    right--;
                }else {
                    return sum;
                }
            }
        }
        return sum;
    }
}


















