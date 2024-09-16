import java.util.Scanner;

public class CountSubsequences {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println(countSubsequences(A, N));
    }

    private static long countSubsequences(int[] A, int N) {
        long[] dp = new long[1 << 6]; // We use 1 << 6 since A[i] is between 1 and 63
        dp[0] = 1; // Base case: empty subsequence has AND = 0
        
        for (int i = 0; i < N; i++) {
            long[] nextDp = dp.clone(); // To update in parallel without affecting current state
            for (int mask = 0; mask < (1 << 6); mask++) {
                int nextMask = mask & A[i];
                nextDp[nextMask] = (nextDp[nextMask] + dp[mask]) % MOD;
            }
            dp = nextDp;
        }
        
        // Total valid subsequences that have AND == 0
        return (dp[0] + MOD) % MOD; // Including the empty subsequence
    }
}
