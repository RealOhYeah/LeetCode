import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static boolean uniqueOccurrences(int[] arr) {
        // 第一步：统计每个数字出现的次数
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 第二步：检查每个出现次数是否唯一
        HashSet<Integer> occurrenceSet = new HashSet<>();
        for (int count : countMap.values()) {
            if (!occurrenceSet.add(count)) {
                return false; // 如果添加失败，说明已经存在相同的出现次数
            }
        }

        return true;

    }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(uniqueOccurrences(arr1));
        System.out.println(uniqueOccurrences(arr2));
        System.out.println(uniqueOccurrences(arr3));
    }
}
