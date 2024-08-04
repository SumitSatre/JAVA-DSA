public class Solution {
    
    public static String breakPalindrome(String palindromeStr) {
        int length = palindromeStr.length();
        
        // If the length of the palindrome is 1, it's impossible to create a non-palindromic string
        if (length == 1) {
            return "IMPOSSIBLE";
        }

        char[] chars = palindromeStr.toCharArray();
        
        // Iterate through the first half of the string
        for (int i = 0; i < length / 2; i++) {
            // Change the first non-'a' character to 'a'
            if (chars[i] != 'a') {
                chars[i] = 'a';
                // The result will not be a palindrome since we've modified only the first half
                return new String(chars);
            }
        }

        // If all characters in the first half are 'a', change the last character to 'b'
        chars[length - 1] = 'b';
        return new String(chars);
    }

    public static String breakPalindrome1(String palindromeStr) {
        int len = palindromeStr.length();

        // Check if all characters are 'a' (impossible to break)
        if (palindromeStr.charAt(0) == 'a' && palindromeStr.equals(palindromeStr.replaceAll("[^a]", ""))) {
            return "IMPOSSIBLE";
        }

        // Iterate through the string, excluding the middle character (if odd length)
        for (int i = 0; i < len / 2; i++) {
            char currentChar = palindromeStr.charAt(i);

            // Skip 'a' as it won't change the lexicographic order
            if (currentChar == 'a') {
                continue;
            }

            // Replace with 'a' (lexicographically smaller)
            String modifiedStr = palindromeStr.substring(0, i) + 'a' + palindromeStr.substring(i + 1);

            // Check if modified string is not a palindrome
            if (!isPalindrome(modifiedStr)) {
                return modifiedStr;
            }
        }

        // If no character can be replaced, change the last character (lexicographically smaller)
        return palindromeStr.substring(0, len - 1) + 'a';
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palindromeStr = "aaa";
        String result = breakPalindrome(palindromeStr);
        // System.out.println(result);  // Output: "aaaabaaa"

        result = breakPalindrome1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(result);  // Output: "aaaabaaa"

        result = breakPalindrome1("aacdefghgfedcba");
        System.out.println(result);  // Output: "aaaabaaa"

        result = breakPalindrome1("bab");
        System.out.println(result);  // Output: "aaaabaaa"
    }
}
