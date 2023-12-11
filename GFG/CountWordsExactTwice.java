
import java.util.HashMap;

public class CountWordsExactTwice {
    public int countWords(String list[], int n) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : list) {
            if (map.containsKey(str)) {
                int val = map.get(str);
                map.put(str, val + 1);
            } else {
                map.put(str, 1);
            }
        }

        // Using an array to hold the result variable
        int[] result = {0};

        map.forEach((key, value) -> {
            if (value == 2) {
                result[0]++;
            }
        });

        return result[0];
    }

    public static void main(String[] args) {
        CountWordsExactTwice gfg = new CountWordsExactTwice();
        String[] words = {"Geek", "for", "Geek", "Geek", "for", "Hello", "World"};
        int result = gfg.countWords(words, words.length);
        System.out.println(result); // Expected output: 1
    }
}
