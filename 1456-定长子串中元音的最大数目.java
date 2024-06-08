import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(maxVowels(sc.nextLine(), sc.nextInt()));

    }
    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int maxVowels = 0;
        int currentVowels = 0;

        // 计算初始窗口内的元音字母数
        for (int i = 0; i < k; i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // 移动窗口并更新最大元音字母数
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i - k)))) {
                currentVowels--;
            }
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }
}
