public class Main {

    public static void main(String[] args)  {

        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1,word2));

    }

    public static String mergeAlternately(String word1, String word2) {

        String max = word1.length() > word2.length() ? word1 : word2;

        String min = word1.length() < word2.length() ? word1 : word2;

        StringBuilder re = new StringBuilder();

        for (int i = 0; i < min.length(); i++) {
            re.append(word1.charAt(i));
            re.append(word2.charAt(i));
        }

        re.append(max.substring(min.length()));

        return re.toString();
    }
}
