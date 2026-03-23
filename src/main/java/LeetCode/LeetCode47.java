package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeetCode47 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
        System.out.print("Enter the "+(i+1)+"th element in array :");
        nums[i]=sc.nextInt();
        }
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //sort so duplicates are adjacent
        boolean[] visited = new boolean[nums.length]; // track which indexes are used
        BackTrack(nums, result, new ArrayList<>(), visited);
        return result;
    }

    public static void BackTrack(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] visited) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // skip already used index
            if (visited[i]) continue;


            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            current.add(nums[i]);
            BackTrack(nums, result, current, visited);
            current.remove(current.size() - 1);
            visited[i] = false; // backtrack
        }
    }
}