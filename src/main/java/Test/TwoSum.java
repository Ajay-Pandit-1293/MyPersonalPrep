package Test;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int n;
        int target;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        target=sc.nextInt();

       boolean found = false;
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if ( arr[i]+arr[j]==target){
                    System.out.println("Pair found at index "+i+" and "+j);
                    found=true;
                    break;
                }
            }
            if (found) break;

        }
        if(!found)System.out.println("NO pair found");

    }


}
