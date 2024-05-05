import java.util.ArrayList; 
import java.util.HashMap;

class Solution {

    public static String reverseVowels(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

       
        hm.put('a',1);
        hm.put('e',1);
        hm.put('i',1);
        hm.put('o',1);
        hm.put('u',1);
        hm.put('A',1);
        hm.put('E',1);
        hm.put('I',1);
        hm.put('O',1);
        hm.put('U',1);

        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (hm.containsKey(s.charAt(i))){
                list.add(s.charAt(i)+0);
                list.add(i);
            }

        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0 , j = list.size() - 1; i < list.size() - 1  ; i += 2,j -= 2) {
            
            sb.setCharAt(list.get(j), (char)(int)list.get(i));

        }


        return sb.toString();
    }
}
