package Day16_MultidimensiolArrays;

import java.util.Scanner;

public class C02_MDA {

    public static void main(String[] args) {

        String[][] siniflar ={{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};


        // G'yi yazdirin

        System.out.println(siniflar[0][2]);
        System.out.println("===================================================");

        // Q'yu Y yapin

        System.out.println(siniflar[2][2]);
        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]);
        System.out.println("===================================================");

        // ilk sinifin mevcudunu yazdirin
        System.out.println(siniflar[0].length);
        System.out.println("===================================================");

        // siniflar'da toplam kac kisi oldugunu yazdirin

        int sinifmevcudu=0;
        for (int i = 0; i < siniflar.length; i++) {

            sinifmevcudu+=siniflar[i].length;
        }
        System.out.println("sınıfların toplam mevcudu "+sinifmevcudu+" kişidir.");


    }



}
