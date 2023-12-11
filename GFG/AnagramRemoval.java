import java.util.Arrays;

public class AnagramRemoval {
    public static int remAnagrams(String s, String s1) {
        int arr[] = new int[26];
        Arrays.fill(arr, 0);

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - 'a';
            arr[k]++;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            int k = s1.charAt(i) - 'a';
            if (arr[k] > 0) {
                arr[k]--;
            } else {
                // If the character is not present in the first string, it needs to be removed
                // So, increment the count
                count++;
            }
        }

        // Add the count of characters in the first string that are not present in the second string
        for (int i = 0; i < 26; i++) {
            count += arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "basgadhbfgvhads";
        String s1 = "sjdhgvbjdsbhvbvd";
        System.out.println(remAnagrams(s, s1)); // Output should be 11
    }
}
