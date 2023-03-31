package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c03_Ternary {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin
        // sayi cift ise "sayi cift"
        // degilse "tek sayi" yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Pozitif bir tamsayı Giriniz");

        double sayi=scan.nextDouble();

        if (sayi%2==0) {
            System.out.println("Çift sayı");
        }else {
            System.out.println("Tek sayı");

        }

        System.out.println(sayi%2==0 ?"çift sayı" : "tek sayı");
    }
}
