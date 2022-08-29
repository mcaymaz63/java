package day42_abstractClass_Interface;

import static day42_abstractClass_Interface.I03_Interfaces.ISIM;

public class K_ChildClassOfInterface implements I02_Interfaces {
    /*
    Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
   */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Yildiz Koleji
    }
}
