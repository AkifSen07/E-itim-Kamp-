package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c01_Nestedif_Artık_Yıl {
    public static void main(String[] args) {

   /*
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
                Kural 1: 4 ile bolunemeyen yillar artik yil
                degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen
        yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir yıl giriniz");

        int yil=scan.nextInt();

        if (!(yil%4==0)){
            System.out.println("Girdiginiz yil artik yil degildir");

         } else if (yil%4==0&&yil%100==0&&yil%400==0) {
            System.out.println("Girdiginiz yil artik yildir");


          }else if (!(yil%4==0&&!(yil%100==0))) {
            System.out.println("Girdiginiz yil artik yil degildir");


           }else System.out.println("Girdiginiz yil artik yildir");
    }
}
/*
        if (yil % 4 != 0){
            System.out.println("Artik yil degil");
        }else if(yil%100 != 0 ){
            System.out.println("Artik yil");
        } else if (yil%400 ==0) {
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil degil"); */
