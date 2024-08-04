import java.util.ArrayList;
import java.util.List;

public class StringPermutationsIterative {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = new ArrayList<>();
        permuteIterative(str, permutations);
        System.out.println("Permutations (Iterative): " + permutations);
    }

    private static void permuteIterative(String str, List<String> permutations) {
        int n = str.length();
        int[] factorial = new int[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        for (int i = 0; i < factorial[n]; i++) {
            StringBuilder current = new StringBuilder(str);
            StringBuilder permutation = new StringBuilder();
            int temp = i;

            for (int div = n; div > 0; div--) {
                int q = temp / factorial[div - 1];
                int r = temp % factorial[div - 1];

                permutation.append(current.charAt(q));
                current.deleteCharAt(q);

                temp = r;
            }

            permutations.add(permutation.toString());
        }
    }
}
