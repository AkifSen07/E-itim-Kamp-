package Day13_WhileLoops;

import java.util.Scanner;

public class C02_Whileloop_Sifre {

    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali



        int flag=0;
        int denemesaayisi=0;
        while (flag!=4){
            Scanner scan=new Scanner(System.in);
            System.out.println("Şifre lütfen");
            String sifre=scan.nextLine();

            if (sifre.charAt(0)>='a'&& sifre.charAt(0)-1<='z' ){
                flag++;
            }else {
                System.out.println("Şifreniz küçük harfle başlamalı");
            }
            if (sifre.charAt(sifre.length()-1)>='A'&& sifre.charAt(sifre.length()-1)<='Z'){
                flag++;

            }else {
                System.out.println("Şifrenizin son harfi büyük harf olmalı");
            }
            if (sifre.contains(" ")) {
                System.out.println("şifre boşluk içermemli");
            }else {
                flag++;
            }
            if (sifre.length()<8){
                System.out.println("şifreniz en az 8 karakterden luşmalı");
            }else {
                flag++;
            }
            denemesaayisi++;

        }
        System.out.println("Tebrikler!!"+denemesaayisi+" denemede başardın");
    }
}
