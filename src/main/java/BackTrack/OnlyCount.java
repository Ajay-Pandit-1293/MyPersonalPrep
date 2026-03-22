package BackTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BackTrack.BackTracking1.BackTrack;

public class OnlyCount {
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
        for (int i : arr){
            System.out.print(i+" ");
        }

        int count = permute(arr,n);
        System.out.println("Total permutations: " + count);

    }

    public static int permute(int arr[], int n){
        return BackTrack(arr, new ArrayList<>(), n);
    }

    public static int BackTrack(int[] arr, List<Integer> current, int n){
        if (current.size()== n){
            return 1;
        }

        int count = 0;
        for (int i =0;i<n;i++){
            if (current.contains(arr[i])){
                continue;
            }
            current.add(arr[i]);
            count += BackTrack(arr,current,n);
            current.remove(current.size()-1);
        }
        return count;
    }
}