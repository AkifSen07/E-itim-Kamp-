package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c04_TekrarlardanKurtulma {

    public static void main(String[] args) {


        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun


        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane bos list olusturalim
        // array'deki her bir elemani ele alalim
        // ele aldigimiz element list'de yoksa ekleyelim, varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> yenilist=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!yenilist.contains(arr[i])) {

                yenilist.add(arr[i]);

            }

        }
        System.out.println(yenilist);

        arr=new int[yenilist.size()];
        for (int i = 0; i < yenilist.size(); i++) {

            arr[i]=yenilist.get(i);




        }

        System.out.println(Arrays.toString(arr));
    }
}
