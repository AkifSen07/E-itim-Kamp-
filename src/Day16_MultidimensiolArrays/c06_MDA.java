package Day16_MultidimensiolArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c06_MDA {

    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de
        //        ayni index’e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //	input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	output:                     [5, 7, 11]


        int[][] arr =  {{3,4,5}, {2,3,6,7},{2,3}};
        int enkısaelement=arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length<enkısaelement) {

                enkısaelement=arr[i].length;
            }

        }
        int [] yeniarr=new int[enkısaelement];

        int indexdekiElementlerToplami=0;

        for (int i = 0; i < yeniarr.length ; i++) {

            for (int j = 0; j <arr.length ; j++) {

                indexdekiElementlerToplami += arr[j][i];
            }
            yeniarr[i]=indexdekiElementlerToplami;
            indexdekiElementlerToplami=0;
        }

        System.out.println(Arrays.toString(yeniarr));



    }
}
