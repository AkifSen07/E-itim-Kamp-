package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c05_get_set {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0)); //3

        // son elementi yazdirin
        System.out.println(sayilar.get(sayilar.size() - 1)); //2


        // 2 elementini 12 yapin
        System.out.println(sayilar.set(2, 12));//2

        System.out.println(sayilar); //[3, 5, 12]


        // 5'i 7 yapalim
        sayilar.set(1,7);
        System.out.println(sayilar); //[3, 7, 12]




    }
}
