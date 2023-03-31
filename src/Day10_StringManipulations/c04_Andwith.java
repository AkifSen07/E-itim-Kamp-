package Day10_StringManipulations;

import java.util.Scanner;

public class c04_Andwith {

    public static void main(String[] args) {


        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.


        Scanner mls=new Scanner(System.in);

        System.out.println("Lütfen MAil adresinizi giriniz.");

        String mail=mls.nextLine();

        if (!(mail.contains("@"))) {
            System.out.println("Geçersiz Mail");

        } else if (!(mail.contains("@gmail.com"))) {
            System.out.println("Gmail hesabı girmelisiniz.");


        } else if (!(mail.endsWith("@gmail.com"))) {
            System.out.println("mailde yazım hatası var.");

        }else {
            System.out.println("İyi yapıyorsun namıssız");
        }


    }
    }

