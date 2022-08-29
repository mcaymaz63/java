package day14_MethodCreation;

public class C04MethodCreationReturn {
    public static void main(String[] args) {

        // verilen isim ve soyismi ilk harfi buyuk
        // geriye kalanlari * olacak sekilde degistirip
        // bize bu halini donduren bir method olusturun
        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

        String isim= "Mevlit";
        String soyisim="Kacmaz";

        String gizliIsim= isimGizle(isim,soyisim);
        System.out.println(isim + " "+ soyisim); // Mevlit kacmaz
        System.out.println(gizliIsim); // M*** K******



    }

    private static String isimGizle(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");


        return isim+" "+soyisim;
    }
    }