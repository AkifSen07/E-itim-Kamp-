package Day15_Arrays;

import java.util.Arrays;

public class C06_ArrayElementEklemeMetodu {

    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun
int[] arr1={1,2,3,4,5,6};
YeniElementEkle(arr1,10);

    }

    public static int[] YeniElementEkle(int[] arr, int Eklenecekelement) {

        int[] yeniarr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            yeniarr[i] = arr[i];

        }
        yeniarr[yeniarr.length - 1] = Eklenecekelement;

        arr = yeniarr;

        System.out.println(Arrays.toString(yeniarr));

        return arr;
    }


}
