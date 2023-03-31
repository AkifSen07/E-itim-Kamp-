package Day11_Loops;

import java.util.Scanner;

public class c11_nestedForloops {
    public static void main(String[] args) {
        /*
        1  	                1. satir 1’den 1’e kadar yazdir
        1  2	            2. satir 1’den 2’e kadar yazdir
        1  2  3	            3. satir 1’den 3’e kadar yazdir
        1  2  3  4.         4. satir 1’den 4’e kadar yazdir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bİr sayı lütfen");
        int satir =scan.nextInt();

        for (int i = 1; i <= satir; i++) {  // satirlar

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        System.out.println("============");


        for (int i = 1; i <= satir; i++) {  // satirlar

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}