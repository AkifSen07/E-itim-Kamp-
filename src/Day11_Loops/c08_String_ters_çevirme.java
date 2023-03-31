package Day11_Loops;

import java.util.Scanner;

public class c08_String_ters_çevirme {
    public static void main(String[] args) {


        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Bana bir şeyler söyle ve sana tersini yazdırayım");

        String input=scan.nextLine();

        for (int i=input.length()-1; i>=0; i-- ) {

            System.out.print(input.charAt(i));
    }
}}
