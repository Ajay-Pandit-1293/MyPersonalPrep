package TestPractice;
import java.util.*;

public class Case2 {
    public static int minOperations(int n, String A, String B) {
        Set<Character> charsInA = new HashSet<>();
        for (char c : A.toCharArray()) charsInA.add(c);

        for (int i = 0; i < n; i++) {
            // B[i] must not be greater than A[i]
            if (B.charAt(i) > A.charAt(i)) return -1;

            // B[i] must exist somewhere in A (to serve as the min of a subset)
            if (!charsInA.contains(B.charAt(i))) return -1;
        }

        Set<Character> distinctTargets = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                distinctTargets.add(B.charAt(i));
            }
        }

        return distinctTargets.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        System.out.println(minOperations(n, A, B));

        sc.close();
    }
}
