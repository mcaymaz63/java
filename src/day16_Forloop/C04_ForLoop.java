package day16_Forloop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
 /*
  Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine "Java" yazdirin.
- Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.

   */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir pozitif tam sayi giriniz");
        int sayi = scan.nextInt();

        int i;
        for (i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0){
            System.out.println("java guzeldir" + "\n");
        }else if (i % 5 == 0) {
            System.out.println("guzeldir");

        } else if (i % 3 == 0) {
            System.out.println("java" + " ");


        } else {
            System.out.println(i + " ");
        }
    }

        }}