import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

  //方法一：
    public static double findMaxAverage(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int num = 0;

        for (int i = 0; i < k; i++) {

            num+=nums[i];
        }

        list.add(num);

        for (int i = k; i < nums.length; i++) {
            num -= nums[i-k];
            num+=nums[i];
            list.add(num);

        }


        return 1.0 * Collections.max(list) / k;
    }

//方法二：

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }   
  
}
