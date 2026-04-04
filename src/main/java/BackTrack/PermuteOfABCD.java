package BackTrack;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermuteOfABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String of which you want permutations : ");
        String s = sc.nextLine();
        List<List<Character>> list = new ArrayList<>();
        list =permute(s,s.length(),new ArrayList<>());
    }

    public static List<List<Character>> permute(String s,int n,List<Character> current){
        if(current.size()==n){
// will complete it soon
        }
        List<List<Character>> result = new ArrayList<>();
        return result;
    }
}
