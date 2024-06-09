public class Main {

    public static void main(String[] args) { 

        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));

    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }
            if (k < 0 && nums[left++] == 0) {
                k++;
            }
        }
        return right - left;
    }
}
