package Day12_Method_Olusturma;

import java.util.Scanner;

public class c06_AsalSayıMethodu {
    public static void main(String[] args) {

        // Verilen 1'den buyuk pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun
        asalkontrol(2);
        asalkontrol(11);
        asalkontrol(20);
    }

    public static void asalkontrol(int sayi) {

        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;

            }
        }
            if (sayi == 2) {
                System.out.println("2 sayısı asaldır");
            } else if (flag == 0) {
                System.out.println("Girilen sayı asaldır");

            }else {
                System.out.println("Asal değil bebeğim");
            }


    }
}
