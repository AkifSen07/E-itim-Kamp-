package Day10_StringManipulations;

import java.util.Scanner;

public class c05_indexof {

    public static void main(String[] args) {

        String str = "Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5

        System.out.println(str.indexOf("a")); // 1 birden fazla ise ilk buldugunu verir

        System.out.println(str.indexOf("cok")); // 5

        System.out.println(str.indexOf("cok", 6)); // 13
        System.out.println(str.indexOf("cok", 5)); // 5

        System.out.println(str.indexOf("java")); // -1  aranan String yoksa -1 doner


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis


        Scanner scan=new Scanner(System.in);

        System.out.println("Gir bi cümle bakalım");

        String cumle=scan.nextLine();

        if (cumle.indexOf("çok")==-1) {
            System.out.println("Çok kelimesini hiç kullanmamışsın");
        } else if (cumle.indexOf("çok",cumle.indexOf("çok")+1)==-1) {
            System.out.println("Çok kelimesini bir defa kullanmışsın");

        } else if (cumle.indexOf("çok",(cumle.indexOf("çok",cumle.indexOf("çok")+1)))==-1) {
            System.out.println("Çok kelimesi 2 defa kullanılmış");

        } else {
            System.out.println("Görünen o ki çok kelimesini çokça kullanıyorsun");
            
        }
//Eğer uzun geldiye else ile if arasında int tanımlayarak parantez içini kısaltabilirsin

    }
}
