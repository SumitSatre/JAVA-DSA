public class Solution {

    public boolean isSubsetSum(int[] arr, int N, int sum) {
        // Create a DP array with size (N+1) x (sum+1)
        boolean[][] dp = new boolean[N + 1][sum + 1];

        // Initialize the DP table
        for (int i = 0; i <= N; i++) {
            dp[i][0] = true; // sum 0 can be achieved by an empty subset
        }

        // Fill the DP table
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        
        print2DArray(dp);
        // The answer is found at dp[N][sum]
        return dp[N][sum];
    }


    public static void print2DArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }


    public static void main(String[] args) {
        Solution solution  = new Solution();
        int[] arr = {34 , 5 , 4 , 2 , 1};
        int sum = 3;
        int N = arr.length;

        if (solution.isSubsetSum(arr, N, sum)) {
            System.out.println(1); // Output: 1
        } else {
            System.out.println(0); // Output: 0
        }
    }
}

//  1) If above is true then it is also true   2)  