//方法一
import java.util.ArrayList; 
import java.util.List;

class Solution {
 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;

        for (int i : candies ) {
            max = Math.max(max, i);
        }
 
        List<Boolean> re = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
 
                re.add(candies[i] + extraCandies >= max);
    
        }

        return re;

    }
}

//方法二
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int[] ints = Arrays.copyOf(candies, candies.length);

        Arrays.sort(candies);

        int max = candies[candies.length - 1];

        List<Boolean> re = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            if (ints[i] + extraCandies >= max) {

                re.add(true);
            } else {
                re.add(false);
            }

        }

        return re;

    }
}


