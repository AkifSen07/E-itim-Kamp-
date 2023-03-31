package Day11_Loops;

import java.util.Scanner;

public class c09_Nested_Java {

    public static void main(String[] args) {

        System.out.println("Pozitif bir tamsayı rica edeceğim");

        Scanner scan=new Scanner(System.in);

int sayi=scan.nextInt();

        for (int i=1; i<=sayi; i++){

            for (int j=1; j<=sayi; j++) {

                System.out.print(i*j+"  ");
            }

            System.out.println("");
        }


    }
}
