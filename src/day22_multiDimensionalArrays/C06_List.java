package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
        arrayi array yapan sembol[] idi
        arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>();
        System.out.println(isimler);// []

        // bir Liste eleman eklemek istersek
        isimler.add("Murat");

        System.out.println(isimler.add("Azra"));// true doner

        /*
        stringde bir method calistirdigimizda
        assingn yapmazsak string degismiyordu


        String isim="ahmet"
        isim.toUppurCase()//AHMET
        sout(isim)--> ahmet
         */
        System.out.println(isimler);//[murat azra]
        /*
        listin tek kotu tarafi array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
         */
    }
}
