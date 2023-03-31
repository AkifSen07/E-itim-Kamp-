package Day11_Loops;

import java.util.Scanner;

public class c04 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
    // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
    // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen toplanacak sayıların aralığını belirlemek üzere başlangıç ve bitiş değeri olacak iki pozitif tamsayı giriniz her girişten sonra entere basınız");

        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;

        if (sayi1>sayi2) {
            System.out.println("başlangıç bitişten büyük olamaz yeniden deneyiniz");

        }else {
            for (int i=sayi1; i<=sayi2; i++){

                toplam+=i;

        }}

        System.out.println("Girdiğiniz değerler arasındaki sayıların toplamı: "+toplam);

    }}
