import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // 示例测试
        System.out.println(removeStars("leet**cod*e"));   
        System.out.println(removeStars("erase*****"));    
    }
}
