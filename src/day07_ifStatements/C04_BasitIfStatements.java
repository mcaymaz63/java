package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        // pazar, pazar, PAZAR , PaZar, PAzar??? bilemeyiz
        // pazar,pazar, pazar, pazar


        if (girilenGun.equals("pazar") ||girilenGun.equals("cumartesi")) {

            System.out.println("Girilen gun HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
        || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
         || girilenGun.equals("cuma")) {

            System.out.println("Girilen gun HAFTAİCİ");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")|| girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }
}
