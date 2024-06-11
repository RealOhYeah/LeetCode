public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};

        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;  // 数组所有元素的总和
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;  // 当前下标左侧元素的总和
        for (int i = 0; i < nums.length; i++) {
            // 如果当前左侧和等于右侧和（即：totalSum - leftSum - nums[i]）
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];  // 更新左侧和
        }

        return -1;  // 如果没有找到中心下标，返回 -1
    }
}
