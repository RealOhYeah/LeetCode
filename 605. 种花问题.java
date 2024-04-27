public class Main {

    public static void main(String[] args) {

        int [] flowerbed = new int[] {1,0,0,0,1};
        int n = 1 ;

        System.out.println(canPlaceFlowers(flowerbed,n));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] a = new int[flowerbed.length + 2];
        System.arraycopy(flowerbed, 0, a, 1, flowerbed.length);
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] == 0 && a[i] == 0 && a[i + 1] == 0) {
                a[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

}
