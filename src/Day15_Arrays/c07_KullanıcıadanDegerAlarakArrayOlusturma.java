package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c07_KullanıcıadanDegerAlarakArrayOlusturma {

    public static void main(String[] args) {

        // Kullanicidan array olusturmak uzere pozitif tamsayilar alin
        // kullaniciya islemi bitirmesi icin 0'a basmasi gerektigini soyleyin
        // bir onceki class'dan method kullanarak aldiginiz elementleri arr'e ekleyin
        Scanner scan=new Scanner(System.in);

        int girilensayi=1;
        int[] arr=new int[0];
        while (girilensayi!=0){

            System.out.println("Lütfen arrayi oluşturacak sayıları giriniz\nBitirmek için sıfıra basınız.");
            girilensayi=scan.nextInt();

            if (girilensayi!=0){

                arr=C06_ArrayElementEklemeMetodu.YeniElementEkle(arr,girilensayi);
            }

        }
        System.out.println("Oluşturduğunuz array: "+Arrays.toString(arr));
    }
}
