package Day13_WhileLoops;

import java.util.Scanner;

public class c04_rakapToplamMethodu {

    public static void main(String[] args) {
        System.out.println(rakamtoplamamethodu(158964));

    }
    public static int rakamtoplamamethodu(int sayi){

        int birlerbasamagi=0;
        int toplam=0;
        while (sayi>0){
            birlerbasamagi=sayi%10;
            toplam+=birlerbasamagi;
            sayi=sayi/10;
        }
        return toplam;
    }
}
