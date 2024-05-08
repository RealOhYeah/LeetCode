import java.util.Arrays;

class Solution {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // 计算左侧所有数字的乘积
        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
        }

        // 计算右侧所有数字的乘积，并与左侧乘积相乘
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }


}
