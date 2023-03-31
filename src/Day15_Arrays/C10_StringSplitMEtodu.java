package Day15_Arrays;

import java.util.Arrays;

public class C10_StringSplitMEtodu {

    public static void main(String[] args) {

        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir
        // str kac kelimedir?
        // en uzun kelime kac harflidir ?
        // bir string'i karakterlerine nasıl ayırırız. Karakter sayısı?

        String str="Java candır gerisi heyecandır. Değil mi?";

        String[] kelimeler=str.split(" ");
        System.out.println("kelimeler: "+Arrays.toString(kelimeler));
       int kackelime= kelimeler.length;
        System.out.println("Kelimeler arrayi "+kackelime +" kelimeden oluşmaktadır");
        System.out.println("=====================================================");

        String enuzunkelime=kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enuzunkelime.length()){
                enuzunkelime=kelimeler[i];
            }
        }
        System.out.println("kelimeler arrayinin en uzun kelimesi "+enuzunkelime +" kelimesidir.");
        System.out.println("=============================================================================");

        String[] harfler=str.split("");

        int harfsayisi=harfler.length;

        System.out.println(Arrays.toString(harfler));
        System.out.println("harf sayısı: "+harfsayisi);


    }
}
