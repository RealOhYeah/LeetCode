class Solution {
   public static int lengthOfLastWord(String s) {

        if (s==null||s.length()==0){
            return 0;
        }
        

        int size = 0;
        

        for (int i = s.length()-1; i >= 0; i--) {

            if (s.charAt(i)!=' '){

                size++;

                continue;
            }

            if (size!=0){
                break;
            }

        }



        return size;
    }
}
