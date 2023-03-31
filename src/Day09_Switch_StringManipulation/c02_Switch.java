package Day09_Switch_StringManipulation;

import java.util.Scanner;

public class c02_Switch {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Haftanın kaçıncı günü olduğunu yazınız");

        byte gun= scan.nextByte();

        switch (gun){
            case (1):
            case(2):
            case(3):
            case(4):
            case(5):
                System.out.println("Hafta içi");
                break;
            case (6):
            case(7):
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("1 haftada 7 gün olduğunu hatırlatırım");
        }
    }
}
