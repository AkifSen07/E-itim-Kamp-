package Day15_Arrays;

public class c02_ArraydaİstenenElemanıBulma {

    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.


        int[] arr={1,2,5,2,5,6,7,5,44,66,55,5};
        String[] arr2={"Aslı","s","H","G","A"};

         arraydakactane(arr,5);
         arraydakactane(arr2,"H");
    }

    public static void arraydakactane(int[] arr,int arananelement){

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananelement){
                sayac++;
            }

        }
        System.out.println("girilen array içinde " +sayac+" tane "+arananelement+" bulunuyor.");

    }
    public static void arraydakactane(String[] arr2,String arananelement){

        int sayac=0;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i].equals(arananelement)){
                sayac++;
            }

        }
        System.out.println("girilen array içinde " +sayac+" tane "+arananelement+" bulunuyor.");
    }
}
