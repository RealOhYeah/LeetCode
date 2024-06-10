public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int[] nums3 = {1, 1, 1};

        System.out.println(longestSubarray(nums1));   
        System.out.println(longestSubarray(nums2));   
        System.out.println(longestSubarray(nums3));   

    }
    public static int longestSubarray(int[] nums) {
        int maxLength = 0;  // 最长子数组长度
        int count = 0;  // 当前滑动窗口中0的个数
        int left = 0;  // 滑动窗口左边界

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                count++;
            }

            while (count > 1) {  // 如果0的个数超过1，需要移动左边界
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);  // 更新最长子数组长度
        }

        return maxLength;
    }
}
