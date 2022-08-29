package day03_Variables;

import java.util.Scanner;

public class C05_Scanner {
    public static <sayiyi> void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi girin");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2= scan.nextDouble();


        System.out.println("Girilen sayilari carpimi:"+sayi1*sayi2);
    }
}
