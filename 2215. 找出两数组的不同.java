import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 使用HashSet去除重复元素
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // 找到nums1中的不同元素
        List<Integer> diff1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        // 找到nums2中的不同元素
        List<Integer> diff2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2)); 

        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};
        System.out.println(findDifference(nums3, nums4)); 
}
}
