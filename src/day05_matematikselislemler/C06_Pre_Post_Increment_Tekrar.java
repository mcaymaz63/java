package day05_matematikselislemler;

public class C06_Pre_Post_Increment_Tekrar {
    public static void main(String[] args) {
        int sayi =20;
        System.out.println("pre-increment:"+ ++sayi);  // 21

        System.out.println("post-increment:"+ sayi++); // 21

        System.out.println("post-increment'den sonra:"+ sayi); // 22

    }
}
