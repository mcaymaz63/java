package day04_dataCasting;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;

        int sayi2=sayi1+1; // sayi2 11
        sayi2+=5;          // sayi2 16
        /* pre veya post increment sadece ++ ve --islemi icin gecerlidir bu iki işlem icin sayidan sonra veya
        önce yazılmasına göre farklı iki isleyis olur */
        int sayi3=sayi2++; // sayi2 bir artırılacak
                           // sayi2 degeri, sayi3'e atanacak

        int sayi4=++sayi1; // sayi1 bir artırılacak
                           // sayi1 degeri, sayi4'e atanacak
    }
}
