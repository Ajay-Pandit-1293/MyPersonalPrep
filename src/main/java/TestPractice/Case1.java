package TestPractice;
import java.util.*;

public class Case1 {
    public static int minMoves(int n, String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        // Step 1: Check if possible
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                return -1; // cannot increase character
            }
        }

        int operations = 0;

        // Step 2: Process from 'z' to 'a'
        for (char ch = 'z'; ch >= 'a'; ch--) {

            // Find indices where A[i] == ch and needs change
            List<Integer> indices = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] == ch && a[i] != b[i]) {
                    indices.add(i);
                }
            }

            // If no such indices, skip
            if (indices.isEmpty()) continue;

            // Find smallest target character among these indices
            char minChar = 'z';
            for (int idx : indices) {
                minChar = (char) Math.min(minChar, b[idx]);
            }

            // Perform operation: convert all to minChar
            for (int idx : indices) {
                a[idx] = minChar;
            }

            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String A = sc.nextLine();
        String B = sc.nextLine();

        int result = minMoves(n, A, B);
        System.out.println(result);
    }
}
