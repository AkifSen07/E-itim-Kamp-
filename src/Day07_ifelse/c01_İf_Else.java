package Day07_ifelse;

import java.util.Scanner;

public class c01_İf_Else {
    public static void main(String[] args) {

        /*Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lütfen Yaşınızı Giriniz.");
        double yas=scan.nextDouble();

        if (((cinsiyet=='e') || (cinsiyet=='E' )) && (yas>=65)) {
        System.out.println("Emekli olabilirsiniz");}

             else if (((cinsiyet=='e') || (cinsiyet=='E' )) && (yas<=65)) {

                System.out.println("Emekli olmanıza "+(65-yas)+" sene var");}

             else if (((cinsiyet=='k') || (cinsiyet=='K' )) && (yas>=60)) {
            System.out.println("Emekli olabilirsiniz");}

        else if (((cinsiyet=='k') || (cinsiyet=='K' )) && (yas<=60)) {
            System.out.println("Emekli olmanıza "+(60-yas)+" sene var");}
        else {
            System.out.println("yanlış giriş yaptınız");
        }




    }}
