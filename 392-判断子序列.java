class Solution {
   public static boolean isSubsequence(String s, String t) {

 //       int index = -1;

        for (int i = 0; i < s.length(); i++) {

            int j = t.indexOf(s.charAt(i)+"");

            if (j>=0){

 //               index = j;

                if (j+1<=t.length()-1){

                    t = t.substring(j+1);

                }else {

                    t = "";
                }


            }else {

                return false;
            }


        }

        return true;
    }

}
