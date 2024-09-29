import java.util.*;

public class Test {

    public static void main(String[] args) {


        int [] a =new int[]{1,2};
        int [] b =new int[]{10};

        System.out.println(Arrays.toString(combine(a, b)));


    }

    public static int[] combine(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        int p = 0;
        int q = 0;
        int key = 0;
        while(p<a.length&&q<b.length){
            if(a[p]<b[q]){
                c[key++] = a[p++];
            }else{
                c[key++] = b[q++];
            }
        }
        while(p<a.length){
            c[key++] = a[p++];
        }
        while(q<b.length){
            c[key++] = b[q++];
        }
        return c;
    }
}





