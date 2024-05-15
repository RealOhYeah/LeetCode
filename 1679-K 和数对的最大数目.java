import java.util.Arrays;
class Solution {
  public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // 使用Arrays.sort对数组进行排序  

        int re = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                re++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return re;
    }
}
