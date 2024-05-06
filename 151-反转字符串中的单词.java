import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        s = s.trim();

        String[] strArr = s.split(" ");
        List<String> list = Arrays.asList(strArr);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();

        list.stream().forEach(s1 -> {
            if (!s1.equals("")) {
                sb.append(s1 + " ");
            }
        });

        return sb.toString().trim();
    }
}
