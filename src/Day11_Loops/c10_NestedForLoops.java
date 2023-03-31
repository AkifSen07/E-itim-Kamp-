package Day11_Loops;

import java.util.Scanner;
import java.util.SortedMap;

public class c10_NestedForLoops {

    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
         * * * * *
         * * * * *
         * * * * *
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Yıldız dikdörtgenin satır ve sütun sayılarını giriniz.Her veriden sonra entere basınız");

        int satir=scan.nextInt();
        int sutun=scan.nextInt();

        for (int i=1; i<=satir; i++){

            for (int j=1; j<=sutun; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
