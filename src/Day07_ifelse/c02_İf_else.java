package Day07_ifelse;

import java.util.Scanner;

public class c02_İf_else {
    public static void main(String[] args) {

        /*Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
zayif yazdirin*/
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu Giriniz.");

        double kilo=scan.nextDouble();

        System.out.println("Lütfen boyunuzu cm cinsinden yazınız.");

        double boy=scan.nextDouble();

        double endeks=(kilo*10000)/ (boy *boy);

        if (endeks<=20) {
            System.out.println("Zayıf");

        } else if (endeks>=20&&endeks<25) {
            System.out.println("normal");

        } else if (endeks>=25&&endeks<30) {
            System.out.println("Kilolu");

        } else if (endeks>=30) {
            System.out.println("Obez");

        }


    }
}
