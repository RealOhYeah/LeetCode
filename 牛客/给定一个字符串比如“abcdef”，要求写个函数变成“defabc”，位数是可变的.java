import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "abcde";
        int inNum = 2;
        System.out.println(combine(str,inNum));

    }
    public static String combine(String str,int inNum){

        if (str == null || str.length() == 0){
            return "";
        }

        String re = "";


        if (inNum < str.length()){
            inNum = str.length() - inNum;

            re += str.substring(inNum) + str.substring(0, inNum);

        }else if (inNum > str.length()){

            // num:9 / len:3 = test:3
            // num:10 / len:3 = test:3...1
            int test =  inNum % str.length();

            if (test == 0){

                return str;

            }else {

                int newInNum = str.length() - inNum / str.length();
                re += str.substring( newInNum)+ str.substring(0, newInNum);

            }

        }else {

            return str;
        }


        return re;
    }
}
