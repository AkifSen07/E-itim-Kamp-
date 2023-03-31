package Day13_WhileLoops;

import java.util.Scanner;

public class c06_Do_While_Loop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        /*Scanner scan=new Scanner(System.in);

        int sayi=1;
        int adet=0;
        int toplam=0;

        while (sayi!=0){
            System.out.println("lütfen toplanmak üzere sayı giriniz.");
            sayi=scan.nextInt();

            toplam+=sayi;

            adet++;

        }
        System.out.println("Girilen sayı adedi "+adet+" Ve toplamı "+toplam);

    }*/

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int adet=0;
        int sayi=0;

        do {
            System.out.println("toplanmak üzere bir sayı giriniz." +"\nBitirmek için sıfıra basınız.");
            sayi=scan.nextInt();
            if (sayi!=0){
            toplam+=sayi;
            adet++;}

        }while (sayi!=0);

        System.out.println("Toplam "+adet+"adet sayı girdiniz ve toplamları "+toplam);

    }
}