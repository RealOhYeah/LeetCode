public class Main {

    public static void main(String[] args) {

        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
    }

        public static boolean increasingTriplet(int[] nums) {

            int small = Integer.MAX_VALUE;
            int mid = Integer.MAX_VALUE;


            for (int i : nums) {

                if (small>=i){
                    small = i;
                }else if (mid>=i){

                    mid = i;
                }else {
                    return true;
                }

            }

            return false;
        }



}
