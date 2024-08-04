import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the total number of days
        int N = scanner.nextInt();
        // Read the total number of obligations
        int M = scanner.nextInt();
        // Read the maximum number of obligations Andy can cancel
        int K = scanner.nextInt();

        // Read the days of obligations and store in a set
        Set<Integer> obligations = new HashSet<>();
        for (int i = 0; i < M; i++) {
            obligations.add(scanner.nextInt());
        }

        // Initialize variables for the sliding window
        int maxVacationDays = 0;
        int left = 1;
        int cancelCount = 0;

        // Use sliding window to find the maximum number of consecutive days
        for (int right = 1; right <= N; right++) {
            if (obligations.contains(right)) {
                cancelCount++;
            }

            while (cancelCount > K) {
                if (obligations.contains(left)) {
                    cancelCount--;
                }
                left++;
            }

            maxVacationDays = Math.max(maxVacationDays, right - left + 1);
        }

        // Print the result
        System.out.println("This is ans : "+maxVacationDays);

        scanner.close();
    }
}
