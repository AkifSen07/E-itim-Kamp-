package Day12_Method_Olusturma;

public class c07_isAsal {

    public static void main(String[] args) {

        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

        System.out.println(isasal(20));
        System.out.println(isasal(19));

    }

    public static boolean isasal(int sayi) {


        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
            if (sayi == 2) {
                return true;
            } else if (flag != 0) {
                return false;
            }else {
                return true;
            }

            }
        }