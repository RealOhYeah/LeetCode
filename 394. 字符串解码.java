import java.util.Stack;

public class Main {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current count and current string onto their stacks
                countStack.push(k);
                stringStack.push(currentString);
                // Reset for the next segment
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop the count and previous string
                int repeatTimes = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                // Append the current string repeatTimes times
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                // Update currentString to the decoded string
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {

        String s1 = "3[a]2[bc]";
        System.out.println(decodeString(s1)); // Output: "aaabcbc"

        String s2 = "3[a2[c]]";
        System.out.println(decodeString(s2)); // Output: "accaccacc"

        String s3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s3)); // Output: "abcabccdcdcdef"

        String s4 = "abc3[cd]xyz";
        System.out.println(decodeString(s4)); // Output: "abccdcdcdxyz"
    }
}
