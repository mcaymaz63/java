package day05_matematikselislemler;

public class C05_Pre_Post_Incement_Tekrar {
    public static void main(String[] args) {
       int sayi1=20;
       int sayi2=sayi1+1; // sayi2 21

       sayi2+=5; // sayi2 25
        /* pre veya ıncement / decrement
        sadece ++ ve -- işlemi için gecerlidir
        bu iki işlem için sayi dan sonra veya önce yazılmasına göre farklı iki işlem olur
         */

       int sayi3= sayi2++; // 1. sayi2 bir artırılacaktır
                           // 2. sayi2 değeri, sayi3'e atanacak
        /* ++ veya-- variable'dan sonra olursa buna post...denir bu durumda o satırda yaıpaln iki işlemden artırma veya azaltma işlemi sonucudur  */

        System.out.println("sayi3 :"+sayi3); // 26
        System.out.println("sayi2:"+sayi2);   // 27

       int sayi4=++sayi1;  // 1. sayi1 bir artırılacak
                           // 2. sayi değeri, sayi4'e atanacak
        /* eger ++ veya -- variable'dan önce ise pre... denir
        bu durumda o satırda yapılan iki işlemden öncelikli olan artırma veya azaltmadır
         */

         System.out.println("sayi4 :"+sayi4); // 21
        System.out.println("sayi1:"+sayi1);   // 21

    }
}
