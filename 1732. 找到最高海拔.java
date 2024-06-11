public class Main {

    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};

        System.out.println(largestAltitude(gain1));  
        System.out.println(largestAltitude(gain2));  

    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;  // 最高海拔
        int currentAltitude = 0;  // 当前海拔

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];  // 计算当前海拔
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;  // 更新最高海拔
            }
        }

        return maxAltitude;
    }

}
