package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class RevArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }

        int left = 0;
        int right = arr.size()-1;
        while (left<right){
            int temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
        System.out.println(arr);

    }

}
