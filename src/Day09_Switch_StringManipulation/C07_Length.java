package Day09_Switch_StringManipulation;

public class C07_Length {

    public static void main(String[] args) {

        String str="ALi Şen evde çok sıkılıyor";

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.charAt(1));

        // bu cumledeki karakter sayisini yazdirin
        System.out.println(str.length()); // 30

        // bu cumledeki son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));


        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length() - 3)); // y
    }
}
