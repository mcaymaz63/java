package day36_inheritancaDataTypeKullanimi;

import java.util.*;

public class Disci extends  BMuhasebe{
    protected int saatUcreti= 11;
    protected int gunlukMesai = 7;

    protected void maasIsci(){
        System.out.println("isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Memurlar %70 indirimli ozel sigorta yaptirabilir");


    }

    public static void main(String[] args) {
        BMuhasebe isc1=new Disci();
         /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        System.out.println(isc1.gunlukMesai); // 8
        System.out.println(isc1.saatUcreti); //10
        isc1.maas(); // muhasebe
        isc1.ozelSigorta(); // ozelsigorta
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departmant);//P

        APersonel isc2=new Disci();
       // System.out.println(isc2.gunlukMesai); // 8
       // System.out.println(isc2.saatUcreti); //10
       // isc2.ozelSigorta(); // ozelsigorta
        isc2.maas();
        isc2.sigorta(); // muhasebe
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departmant);//P

        List<String> list=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();

         /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */

    }

}