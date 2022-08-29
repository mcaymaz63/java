package day06_concatenation;
import java.util.Scanner;


public class C01_WrapperClass {
    public static void main(String[] args) {


        String str="java ile hayat ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi= true;
        Boolean buGuzelMi=true;
        buGuzelMi.toString();



        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo="123456";

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 5 basamaklı bir sifre giriniz");

        String sifre= scan.nextLine();

        Integer sifreSayisi=Integer.parseInt(sifre);
        


        System.out.println("girilen sifrenin 3 fazlası :"+(sifre+3));
        System.out.println("Integer sifrenin 3 fazlası :"+(sifreSayisi+3));
    }
}
