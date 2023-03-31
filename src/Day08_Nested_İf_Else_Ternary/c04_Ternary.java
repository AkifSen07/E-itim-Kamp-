package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c04_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip
        // mutlak degerine cevirip yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı Giriniz");

        double sayi=scan.nextDouble();


        System.out.println(sayi>=0 ?+sayi :+(sayi*-1));
    }
}
