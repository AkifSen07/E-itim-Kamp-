package Day11_Loops;

import java.util.Scanner;

public class c07_Faktoryel2 {
    public static void main(String[] args) {


        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        //       Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	     Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);

        System.out.println("20 den küçük bir pozitif tamsayı giriniz.");

        int sayi=scan.nextInt();

        int carpim=1;
        System.out.print(sayi+"!= ");

        for (int i=sayi; i>=1; i-- ) {carpim *=i;

            if (i!=1){
                System.out.print(i+"*");
            }else {
                System.out.print(i+"= ");
            }

        }

        System.out.print(carpim);
    }

}
