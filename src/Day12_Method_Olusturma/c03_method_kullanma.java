package Day12_Method_Olusturma;

import java.util.Scanner;

public class c03_method_kullanma {
    public static void main(String[] args) {

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
int sonuc=c02_Faktoryel_Methodu.faktoryelhesapla(sayi1)+c02_Faktoryel_Methodu.faktoryelhesapla(sayi2);

        System.out.println(sonuc);
    }
}