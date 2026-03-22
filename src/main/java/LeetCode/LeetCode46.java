package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Permutations
public class LeetCode46 {
    public static void main(String[] args) {
        int n;
        List<List<Integer>> result = new ArrayList<>();
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

        result = permute(arr,n);
        System.out.println(result);

    }

    public static List<List<Integer>> permute(int arr[], int n){
        List<List<Integer>> result = new ArrayList<>();
        BackTrack(arr,result,new ArrayList<>(),n);

        return result;
    }
    public static void BackTrack(int[] arr, List<List<Integer>> result, List<Integer> current, int n){
        if (current.size()== n){
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i =0;i<n;i++){
            if (current.contains(arr[i])){
                continue;
            }
            current.add(arr[i]);
            BackTrack(arr,result,current,n);
            current.remove(current.size()-1);
        }
    }

}
