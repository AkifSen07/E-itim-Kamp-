package Day12_Method_Olusturma;

public class c02_Faktoryel_Methodu {

    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun

        int sonuc = faktoryelhesapla(5);
        System.out.println(sonuc);
    }
        public static int faktoryelhesapla(int sayi) {

            int faktoryel = 1;
            for (int i = sayi; i >= 1; i--) {

                faktoryel *= i;
            }

return faktoryel;

        }
    }
