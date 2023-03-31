package Day15_Arrays;

public class c03En_Uzun_Elementi_Yazdır {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        String[] arr={"Ali","Hüseyin","Melike","Cem","saadettin","Sinan","su"};
        EnuzunEnKisa(arr);


    }
    public static void EnuzunEnKisa(String[] arr1){

      String enuzun=arr1[0];
      String enkisa=arr1[0];

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i].length()>=enuzun.length()){

                arr1[i]=enuzun;
            }if (arr1[i].length()<=enkisa.length()){

                arr1[i]=enkisa;
            }

        }
        System.out.println("En uzun kelime "+enuzun);
        System.out.println("En kısa kelime "+enkisa);


    }
}
