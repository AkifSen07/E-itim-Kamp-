package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c03_Remove {

    public static void main(String[] args) {

        List<String> Arr=new ArrayList<>();

        Arr.add("Ayşe");
        Arr.add("Fatma");
        Arr.add("Hayriye");

        System.out.println(Arr);

        Arr.remove("Ayşe");
        System.out.println(Arr.remove(1));

        System.out.println(Arr);

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]
        /*
            Eger sayilardan olusan bir list varsa
            remove method'una yazacagimiz sayiyi index olarak kabul eder
            Eger sayiyi silmek isterseniz
            remove method'undan once o sayiyi bir objeye atayip
            remove method'unda obje ismini yazabiliriz
         */
        sayilar.remove(1);
        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi = 1;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [18, 2]

    }
}
