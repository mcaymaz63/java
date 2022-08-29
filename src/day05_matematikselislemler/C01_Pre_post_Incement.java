package day05_matematikselislemler;

public class C01_Pre_post_Incement {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("preincrement :"+ ++sayi); // 11



        System.out.println("post-increment:"+ sayi++); // 11


        System.out.println("post-increment'den sonra:"+sayi); // 12


        sayi++; // 13

        ++sayi; // 14
    }
}
