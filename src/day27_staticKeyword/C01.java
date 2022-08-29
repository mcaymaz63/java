package day27_staticKeyword;

public class C01 {
    static  int sayi=10;// static (class) variable
    int rakam=5;  // instance varable

    public static void main(String[] args) {
          /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */

    C01 obje1=new C01();
        System.out.println("obje1`in rakam degeri:"+obje1.rakam);// 5
        System.out.println("obje`in sayi deger :"+sayi);// 10

        obje1.rakam+=1;//5+1=6
        sayi+=1; // 10+1=11

       System.out.println("1 artirdiktan sonra obje1 in rakam degeri:"+obje1.rakam);// 5
        System.out.println("1 artirdiktan sonra obje in sayi deger :"+sayi);// 10


        C01 obje2=new  C01();


        System.out.println("obje2 in rakam degeri:"+obje2.rakam);// 5
        System.out.println("obje2 in sayi deger :"+sayi);// 11


        obje2.rakam++;//5+1=6
        obje2.sayi++;// 11+1=12

        System.out.println("1 artirdiktan sonra obje2 in rakam degeri:"+obje2.rakam);// 6
        System.out.println("1 artirdiktan sonra obje2 in sayi deger :"+sayi);// 12


    }
}
