package Day12_Method_Olusturma;

import java.util.Scanner;

public class c04_StringiTersCevirme {
    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun
        System.out.println(terscevir("ey edip adanada pide yi"));

    }
public static String terscevir(String metin){
    String tersmetin="";

    for (int i=metin.length()-1; i>=0; i--){
        tersmetin+=metin.charAt(i);




    }
    return tersmetin;

}
}
