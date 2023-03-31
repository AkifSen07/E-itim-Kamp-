package Day09_Switch_StringManipulation;

import java.util.Locale;

public class C03_toLowercase_toUppercase {
    public static void main(String[] args) {

        String orn = "Java candır";

        System.out.println(orn.toUpperCase(Locale.ENGLISH));

        orn = orn.toUpperCase(Locale.ENGLISH);

        System.out.println(orn.toLowerCase(Locale.ENGLISH));


        if (orn.toUpperCase().equals("JAVA CANDIR")) {
            System.out.println("Hurrey");

        }
    }
}
