import java.util.Scanner;

public class Main {

    // Function to count the number of valid subsequences
    public static long countSubseq(int[] arr) {
        int n = arr.length;

        // Special case when the array has only one element
        if (n == 1) {
            return arr[0] == 0 ? 1 : 0;
        }

        long[] dp = new long[n];
        // Initialize dp array with 1
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
        }

        long total_count = 0;

        // Calculate dp[i] for each element in the array
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] < arr[i] && (arr[i] & arr[j]) == 0) {
                    dp[i] += dp[j];
                }
            }
            total_count += dp[i];
        }

        return total_count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements from the input
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Print the result of countSubseq function
        System.out.println(countSubseq(arr));
    }
}
