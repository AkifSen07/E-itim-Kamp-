package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c08_Nested_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olanib yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");

        double sayi=scan.nextDouble();

        System.out.println(sayi>0
                ?sayi%2==0?"çift sayi":"tek sayi"
                :sayi/100<=-1&&sayi/100>=-100?"üç basamaklı nefatif sayı":"üç basmaklı olmayan negatif sayı");

}}
