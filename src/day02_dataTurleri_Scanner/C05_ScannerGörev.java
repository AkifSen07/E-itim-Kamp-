package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerGörev {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen vize notunuzu giriniz.");

        Scanner scan2 = new Scanner(System.in);

        double vize = scan2.nextDouble();

        System.out.println("Lütfen final notunuzu giriniz.");

        double finall = scan.nextDouble();

        System.out.println("Yıl Sonu Notunuz: " + (4 * vize / 10+6 * finall / 10));
    }
}