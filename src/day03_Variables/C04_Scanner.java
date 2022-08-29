package day03_Variables;


import java.util.Scanner;

public class C04_Scanner {
    public static <scanner> void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String kullanıcıismi= Scan.next();
        System.out.println("isminizi:"+kullanıcıismi);
    }
}

