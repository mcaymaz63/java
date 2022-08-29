package day14_MethodCreation;

import day13_MetothCrestion.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim
        int input=521;
        rakamlariTopla(input, 6);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");
    }
    public static void rakamlariTopla(int input, int i) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);
    }

}
