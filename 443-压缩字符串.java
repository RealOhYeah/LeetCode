import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(compress(new char[]{'a', 'b', 'c'}));
   }

    // 方法一
    public static int compress(char[] chars) {

        if (chars.length == 0 || chars == null){
            return 0;
        }

        if (chars.length == 1){
            return 1;
        }

        ArrayList<Object> list = new ArrayList<>();

        char target = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {

            if (chars[i] == target){
                count++;

            }else {
                list.add(target);

                if (count != 1){

                    String s = count + "";
                    char[] charArray = s.toCharArray();
                    for (char c: charArray) {
                        list.add(c);
                    }

                }
                count = 1;
                target = chars[i];

            }


        }

        if ( count != 1 || chars[chars.length-1] != chars[chars.length-2] ){


            list.add(target);

            if (count != 1){

                String s = count + "";
                char[] charArray = s.toCharArray();
                for (char c: charArray) {
                    list.add(c);
                }

            }


        }

        for (int i = 0; i < list.size(); i++) {


            chars[i] = (list.get(i)+"").charAt(0);

        }


//        System.out.println(list);
        System.out.println(Arrays.toString(chars));

        return list.size();
    }

  // 方法二
    public static int compressTwo(char[] chars) {
        // 边界情况：如果输入数组长度为 1，则无需压缩，直接返回长度 1
        if (chars.length == 1) {
            return 1;
        }

        // 初始化指针和计数器
        int left = 0;
        int count = 1;
        // 用于记录压缩后的新数组的索引
        int index = 0;

        // 开始遍历数组
        for (int right = 1; right < chars.length; right++) {
            // 如果当前字符与前一个字符相同，则增加计数器
            if (chars[right] == chars[right - 1]) {
                count++;
            } else {
                // 如果当前字符与前一个字符不同，则将前一个字符及其计数器添加到新数组中
                chars[index++] = chars[left];
                // 如果计数器大于 1，则将计数器的数字依次添加到新数组中
                if (count > 1) {
                    for (char digit : String.valueOf(count).toCharArray()) {
                        chars[index++] = digit;
                    }
                }
                // 重置左指针和计数器
                left = right;
                count = 1;
            }
        }

        // 处理最后一个字符及其计数器
        chars[index++] = chars[left];
        if (count > 1) {
            for (char digit : String.valueOf(count).toCharArray()) {
                chars[index++] = digit;
            }
        }

        System.out.println(Arrays.toString(chars));

        return index;
    }



}
