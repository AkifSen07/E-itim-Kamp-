package Day15_Arrays;

import java.util.Arrays;

public class c05_ArayaElementEkleme {

    public static void main(String[] args) {

         /*
            int[] a = {4,5,6};
            int[] b = {4,5,6,10};
            a = b ;
            System.out.println(Arrays.toString(a));
            Array'in uzunlugu degistirilmez
            Ancak array'e yeni bir array degeri atanabilir
         */

        // Verilen array'e istenen elementi ekleyelim
        int[] arr = {4,5,6};
        int eklenecekElement = 10;


        // arr = new int[4]; // [0,0,0,0] direk atama yaparsak eski degerler kaybolur
        // once istenen uzunlukta yeni bir array olusturup
        // eski array'deki tum elementleri yeni array'e tasiyoruz
        // sonra istenen elementi'de atayip
        // yeni istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array'in degerini eskisine atiyoruz


        int[] yeniarr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            yeniarr[i]=arr[i];

        }
        yeniarr[yeniarr.length-1]=eklenecekElement;

        System.out.println(Arrays.toString(yeniarr));

        arr=yeniarr;

        System.out.println(Arrays.toString(arr));
    }
}
