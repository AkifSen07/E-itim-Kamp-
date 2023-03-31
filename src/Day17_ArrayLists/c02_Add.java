package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c02_Add {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);

        // 3 ile 5 arasina element olarak 7 ekleyin


        sayilar.add(1,7);
        System.out.println(sayilar);

        //yeni bir list belirleyip o listi komple sayılar listine ekleyin

        List<Integer> ekler=new ArrayList<>();
        ekler.add(4);
        ekler.add(5);
        System.out.println(ekler);

        sayilar.addAll(ekler);
        System.out.println(sayilar);

        //yeni bir list belirleyip o listi sayılar listinde 5 ile 2 arasına ekleyin

        sayilar.addAll(3,ekler);
        System.out.println(sayilar);
    }
}
