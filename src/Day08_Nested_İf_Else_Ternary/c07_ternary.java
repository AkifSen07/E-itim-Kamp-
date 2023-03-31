package Day08_Nested_İf_Else_Ternary;

import java.util.Scanner;

public class c07_ternary {
    public static void main(String[] args) {

        //         Soru 3- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir harf Giriniz");

        char harf=scan.next().charAt(0);

        System.out.println('a'<=harf && 'z'>=harf ?Character.toUpperCase(harf) :harf);

    }
}
