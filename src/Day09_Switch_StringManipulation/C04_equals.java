package Day09_Switch_StringManipulation;

public class C04_equals {

    public static void main(String[] args) {

String str1="Ahmet";
String str2="ahmet";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        String str5 = "Java";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6.concat(str7);

        System.out.println(str8);// Java

        System.out.println(str1 == str5); // Java == Java  true

        System.out.println(str5 == str8); // Java == Java false

        System.out.println(str5.equals(str8));

        /*
            == ile Stringleri karsilastirirsak hem metin degerine hem de referanslarina bakar
            equals ile Stringleri karsilastirirsak sadece metin degerlerine bakar
            == ile Stringleri karsilastirdigimizda bekledigimizden farkli sonuclar alabilir,
            bu yuzden iki String'i karsilastiracaksak == degil equals kullaniriz
         */






    }
}
