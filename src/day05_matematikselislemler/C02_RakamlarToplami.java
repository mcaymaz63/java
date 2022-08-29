package day05_matematikselislemler;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt(); // 5267

        int birlerBasamagi=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;

        birlerBasamagi=sayi % 10;
        rakamlarToplamı+= birlerBasamagi;
        sayi /=10;
        // 526 ab 7 rt 7
        birlerBasamagi=sayi%10; // 6
        rakamlarToplamı+=birlerBasamagi; // 7+6=13
        sayi /=10;
        // suanda sayi 52 ab 6 rt 13
        birlerBasamagi=sayi%10; // 2
        rakamlarToplamı+=birlerBasamagi; // 13+2=15
        sayi /=10; // 5
        // suan sayi 5 ab 2 rt 15
        birlerBasamagi= sayi%10; // 5
        rakamlarToplamı+= birlerBasamagi; // 15+5=20
        // suan yeni sayi 0 ab 5 rt 20

        System.out.println(ilkGirilenSayi+"sayisinin rakamlar toplami:"+rakamlarToplamı);
    }
}
