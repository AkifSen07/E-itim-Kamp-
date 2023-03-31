package Day13_WhileLoops;

import java.util.Scanner;

public class c01_Whileloop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /// Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        int girilenSayi=0;
        int toplam = 0;
        int sayiadedi = 0;

        while (toplam < 500) {
            System.out.println("Lütfen sayı giriniz");
            girilenSayi=scan.nextInt();

            toplam += girilenSayi;

            sayiadedi++;
        }
        System.out.println("Toplam "+sayiadedi+" sayı girdiniz ve toplamları "+toplam);
    }

}
