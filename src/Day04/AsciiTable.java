package Day04;

import java.util.Scanner;

public class AsciiTable {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Bir harf Giriniz.");

        char girilenharf= scan.next().charAt(0);

        System.out.println("Girilen harfin 3 sonrası: "+ (char)(girilenharf+3));


    }
}
