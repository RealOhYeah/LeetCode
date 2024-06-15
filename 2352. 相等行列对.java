import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        System.out.println(equalPairs(grid1));  // Output: 1

        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        System.out.println(equalPairs(grid2));  // Output: 3
    }
    public static int equalPairs(int[][] grid) {
        int n = grid.length;

        // Step 1: Store row vectors in a hash table
        Map<String, Integer> rowVectors = new HashMap<>();

        for (int[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (int num : row) {
                sb.append(num).append(",");
            }
            String rowStr = sb.toString();
            rowVectors.put(rowStr, rowVectors.getOrDefault(rowStr, 0) + 1);
        }

        // Step 2: Compare column vectors with stored row vectors
        int count = 0;
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colStr = sb.toString();
            if (rowVectors.containsKey(colStr)) {
                count += rowVectors.get(colStr);
            }
        }

        return count;
    }
}
