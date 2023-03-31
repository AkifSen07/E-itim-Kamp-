package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c02_Nested_IF_Else {
    public static void main(String[] args)

     /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin
         */ {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        char cins = scan.next().charAt(0);
        System.out.println("Lütfen yasınızı Giriniz");
        double yas = scan.nextDouble();

        if (cins == 'e' || cins == 'E') {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("emekli olmanıza " + (65 - yas) + " yıl var.");}

            } else if (cins == 'k' || cins == 'K') {if (yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("emekli olmanıza " + (60 - yas) + " yıl var.");}

            } else System.out.println("Böyle cinsiyet mi olur gerizekalı!!");
        }
    }