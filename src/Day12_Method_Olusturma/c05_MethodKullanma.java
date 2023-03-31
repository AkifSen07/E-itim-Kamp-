package Day12_Method_Olusturma;

import java.util.Scanner;

public class c05_MethodKullanma {
    public static void main(String[] args) {

        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime gir ve onun palindrome olup olmadığını öğren");
        String metin=scan.nextLine();

        String tersmetin=c04_StringiTersCevirme.terscevir(metin);

        if (metin.equalsIgnoreCase(tersmetin)) {
            System.out.println(c04_StringiTersCevirme.terscevir(metin));
            System.out.println("Girdiğiniz metin palindrome");
        }else {
            System.out.println(c04_StringiTersCevirme.terscevir(metin));
            System.out.println("Bu metin palindrome değil.");
        }

    }
}
