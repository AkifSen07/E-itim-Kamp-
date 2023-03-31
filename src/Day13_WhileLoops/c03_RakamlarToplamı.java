package Day13_WhileLoops;

import java.util.Scanner;

public class c03_RakamlarToplamı {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("rakamları toplanacak sayıyıy giriniz");
        int girilensayi=scan.nextInt();

    int birlerbassamagi=0;
    int toplam=0;

    while (girilensayi>0){
      birlerbassamagi=girilensayi%10;
      toplam+=birlerbassamagi;
      girilensayi=girilensayi/10;


    }
        System.out.println("rakamlar toplamı: "+toplam);

    }
}
