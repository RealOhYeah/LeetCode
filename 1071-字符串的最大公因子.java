
//方法一：
class Solution {
   public String gcdOfStrings(String str1, String str2) {
      if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
      
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    } 
}

//方法二：
import java.math.BigInteger;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } 
        return str1.substring(0,Integer.valueOf(new BigInteger(str1.length()+"").gcd(new BigInteger( str2.length()+"")).toString()));
    }  
}
