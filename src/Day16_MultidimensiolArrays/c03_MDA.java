package Day16_MultidimensiolArrays;

public class c03_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactir ?

        int elementsayisi=0;

        for (int i = 0; i < arr.length; i++) {

            elementsayisi+=arr[i].length;
        }
        System.out.println("Toplam element sayısı: "+elementsayisi);
        System.out.println("======================================");

        // tum elementlerin toplamini bulun
        // MDA'lerde her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz

        int elementlertoplami=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                elementlertoplami+=arr[i][j];

            }
        }
        System.out.println("Elementler toplama: "+elementlertoplami);


    }
}
