package Day11_Loops;

import java.util.Scanner;

public class c06_Faktoryel {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        Scanner scan=new Scanner(System.in);

        System.out.println("20 den küçük bir pozitif tamsayı giriniz.");

        int sayi=scan.nextInt();

        int carpim=1;

        for (int i=1; i<=sayi; i++ ) {carpim = carpim * i;}

        System.out.println(sayi+"!: "+carpim);
    }
}
