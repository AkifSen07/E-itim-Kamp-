package Day10_StringManipulations;

import java.util.Scanner;

public class c06_Lastindeks {
    public static void main(String[] args) {

        String str = "Java bazen beyin yakar";

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a")); // 20

        System.out.println(str.indexOf("a", 2)); // 3

        System.out.println(str.lastIndexOf("beyin", 19)); // 18

        System.out.println(str.indexOf("a",4)); // 6

        System.out.println(str.lastIndexOf("a", 17)); // 6

        System.out.println(str.indexOf('e')); // 8
        System.out.println(str.lastIndexOf('e')); // 12

        System.out.println(str.lastIndexOf("Mustafa")); // -1

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        Scanner scan=new Scanner(System.in);

        System.out.println("Gir bi cümle bakalım");

        String cumle=scan.nextLine();

        if (cumle.lastIndexOf("çok")==-1) {
            System.out.println("cümle çok kelimesini barındırmıyor.");


        } else if (cumle.lastIndexOf("çok",(cumle.lastIndexOf("çok"))-1)==-1) {
            System.out.println("çok kelimesi 1 kere kullanılmış");

        } else if (cumle.lastIndexOf("çok",cumle.lastIndexOf("çok",(cumle.lastIndexOf("çok"))-1)-1)==-1) {
            System.out.println("çok kelimesini iki kez kullanmışsın");

        }else System.out.println("çok kelimesi çokça kullanılmış");


    }
}
