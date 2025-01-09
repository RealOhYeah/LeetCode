import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
		//注意小数的四舍五入
        System.out.println((int)(scan.nextInt()*1.0 * 9 / 5 + 32));

        scan.close();
    }
}