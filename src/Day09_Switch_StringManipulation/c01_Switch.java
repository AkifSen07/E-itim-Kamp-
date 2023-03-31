package Day09_Switch_StringManipulation;

import java.util.Scanner;

public class c01_Switch {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir rakam Giriniz");

        byte rakam= scan.nextByte();

        switch (rakam)
        {


            case (0):
                System.out.println("Sıfır");
                break;
            case (1):
                System.out.println("Bir");
                break;
            case (2):
                System.out.println("İki");
                break;
            case (3):
                System.out.println("üç");
                break;
            case (4):
                System.out.println("dört");
                break;
            case (5):
                System.out.println("beş");
                break;
            case (6):
                System.out.println("Altı");
                break;
                case (7):
                System.out.println("Yedi");
                break;
            case (8):
                System.out.println("Sekiz");
                break;
            case (9):
                System.out.println("Dokuz");
                break;
                default:
                System.out.println("Geçersiz Giriş");
        }
    }
}
