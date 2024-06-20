import java.util.Stack;

public class Main {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                exploded = true;
                break;
            }

            if (!exploded) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] asteroids1 = {5, 10, -5};
        int[] result1 = asteroidCollision(asteroids1);
        System.out.println(java.util.Arrays.toString(result1));

        int[] asteroids2 = {8, -8};
        int[] result2 = asteroidCollision(asteroids2);
        System.out.println(java.util.Arrays.toString(result2));

        int[] asteroids3 = {10, 2, -5};
        int[] result3 = asteroidCollision(asteroids3);
        System.out.println(java.util.Arrays.toString(result3));
    }
}
