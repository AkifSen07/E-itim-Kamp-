package Day03_Scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner1 {

    public static void main(String[] args) {



        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");
         */

        // Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // Ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        // SIMDILIK kullanici biz ne diyorsak onu tam yapiyor kabul edelim

        /*
        System.out.print("Isminiz : " + isim);
        System.out.print("Soyisminiz : " + soyisim);
        System.out.print("Yasiniz : " + yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir");
        System.out.println()'deki ln
        yazdirma islemini yaptiktan sonra
        alt satira gecmesini saglar
        println yerine print yazarsak
        yazdirdigimiz seyler yanyana yazdirilir

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz");

        String isim=scan.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz");

        byte yas=scan.nextByte();

        System.out.println("İsim: "+isim+"\nSoyisminiz: "+soyisim+
                "\nYaşınız: "+yas+ "\nKaydınız Başarı ile Tamamlanmıştır.");
         /*
            Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
            String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */
    }
}
