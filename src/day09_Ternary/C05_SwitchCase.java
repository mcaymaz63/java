package day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
/*
 kullanicidan gun numarasini alip
 1 ise pazartesi,
 ...
 7 ise pazar yazdiralim
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();
 /*
         switch yanina yazilan ( ) neye gore case atayacagimizi gosterir
         Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
         break yazisi gorunceye veya switch parantezine kadar devam eder
         if - else if - .... -else yapisinda oldugu gibi
         hic bir sarta uymayanlari default keyword kullanilir
         */
        switch (gunNo){

            case  1 :
                System.out.println("pazartes");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartes");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli gun sayisini giriniz");


        }


}
}
