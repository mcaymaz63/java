package day03_Variables;


import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {


Scanner scan=new Scanner(System.in);
System.out.println("Lutfen isminizi giriniz");
String isim=scan.nextLine();
System.out.println("Lutfen soyisminizi giriniz");
String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler="+isim+","+soyisim+","+yas);
    }
}
