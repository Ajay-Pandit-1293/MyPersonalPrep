package TestPractice;

import java.util.Scanner;

public class KingMartinArmy {

    static int backtrack(int[] seq, int pos, int N, int r, int end) {
        if (pos == N) {
            return (seq[pos - 1] == end) ? 1 : 0;
        }
        int count = 0;
        for (int rank = 1; rank <= r; rank++) {
            if (rank != seq[pos - 1]) {
                seq[pos] = rank;
                count += backtrack(seq, pos + 1, N, r, end);
                seq[pos] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int end = sc.nextInt();

        int[] seq = new int[N];
        seq[0] = 1;

        System.out.println(backtrack(seq, 1, N, r, end));
    }
}