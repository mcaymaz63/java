package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre =scan.nextLine();
        char ilkHarf= sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("gecerli sifre");
            }

        }else if (ilkHarf>='a' && ilkHarf<='z'){
            if (ilkHarf=='z'){
                System.out.println("gecerli sifre ");
            }

        }else {
            System.out.println("gecersiz sifre");

            System.out.println("Lutfen ilk karekter icin sadece harf kullanin");
        }

    }
}
