package day03_Variables;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soytisminizi ve yaşinizi giriniz aralarda Enter tuşuna basınız");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("girilen bilgiler="+isim+","+soyisim+","+yas);

    }
}
