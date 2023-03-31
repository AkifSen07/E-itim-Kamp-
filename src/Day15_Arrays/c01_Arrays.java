package Day15_Arrays;

import java.util.Arrays;

public class c01_Arrays {


    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.,
        int[] arr={3,4,5,6};

        ArrayElementleriniArttir(arr,2);

        System.out.println(Arrays.toString(arr));


    }
public static int[] ArrayElementleriniArttir(int [] arrilk, int artis){

    for (int i = 0; i < arrilk.length; i++) {

        arrilk[i]+=artis;


    }
return arrilk;

    }
}
