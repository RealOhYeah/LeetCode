class Solution {
  //方法一：
       public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int index = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

//方法二：
  public static void moveZeroes(int[] nums) {

        int tempZero = 0;

        for (int i = 0; i < nums.length-tempZero; ) {

            if (nums[i]==0){
 
                for (int j = i,k=j+1; j < k&&k<nums.length-tempZero; j++,k++) {

                    nums[j]=nums[k];
                    nums[k]=0;


                }
                i=0;

                tempZero++;
                continue;
            }

            i++;
        } 
    }
 
}
