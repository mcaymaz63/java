package day03_Variables;

import java.util.Scanner;

public class C03_ScannerÖdev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // iki tam sayinin toplam,farkı,çarpımı
        System.out.println("iki tam sayı girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("iki sayinin toplamı="+(sayi1+sayi2));
        System.out.println("iki sayinin farkı="+(sayi1-sayi2));
        System.out.println("iki sayinin çarpımı="+(sayi1*sayi2));

        // kare uzunluğu isteyip, karenin çevresini ve alanını hasaplayınız

        System.out.println("karenin kenarını girin");
        double kareKenarı= scan.nextDouble();
        System.out.println("kareninin çevresini="+4*kareKenarı);
        System.out.println("karenin alanı="+kareKenarı*kareKenarı);

        // yarıçap uzunluğu isteyip çeberin çevresini ve dairenin alanını hesaplayınız

        System.out.println("çemberin yarıçapını girin");
        double yarıçap= scan.nextDouble();
        System.out.println("çemberin çevresi="+2*3.14*yarıçap);
        System.out.println("çemberin alanı="+3.14*yarıçap*yarıçap);

        // kullanıcıdan isim soyisim isteyerek katılımın alındığını söyleyip teşekkür etme yazısı

        System.out.println("lütfen isminizi ve soyisminizi girin");
        String isim= scan.nextLine();
        String soyisim =scan.nextLine();
        System.out.println("isminiz soyisminiz="+isim+soyisim);
        System.out.println("kursumuza katılımınız alınmıştır, teşekkür ederiz");


    }
}
