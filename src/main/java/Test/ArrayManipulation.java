package Test;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        double average=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        average = (double) sum/n;

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }
}
