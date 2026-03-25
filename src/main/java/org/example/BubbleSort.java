package org.example;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fucking size of the fucking array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the fucking elements of the fucking array : ");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);}

    }

}
