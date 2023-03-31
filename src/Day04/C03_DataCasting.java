package Day04;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");

     int yas= scan.nextInt();

     if(yas>=65){
         System.out.println("Emekli olabilirsin");
     } else {
         System.out.println("Emekli olmak için "+(65-yas)+" yıl çalışman gerekli");


     }

    }
}
