package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

      //  Soru 5- Verilen bir array’e yeni bir element ekleyin

        String [] sinifListesi={"firuze azra","ahmet kerim","murat taha"};// sinif listesi mevcut olan
        String eklenecekIsim="mevlit kacmaz";// eklenecek isim

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);// eleman ekleme metodu
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi=new String[sinifListesi.length+1];//[null,null,null,null] eski listwsinin bir fazlasi girdik
        // eski listeden 1 elaman fazla uzunlukta yeni listeye tasidim
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];


        }
       // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
       //son index'e ise eklenecek ismi atadim
        return yeniSinifListesi;
    }
}
