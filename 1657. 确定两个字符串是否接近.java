import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "aa";
        boolean result = closeStrings(word1, word2);
        System.out.println(result); // Output: true
    }
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        boolean[] exist1 = new boolean[26];
        boolean[] exist2 = new boolean[26];

        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
            exist1[c - 'a'] = true;
        }

        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
            exist2[c - 'a'] = true;
        }

        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2) && Arrays.equals(exist1, exist2);
    }
}
