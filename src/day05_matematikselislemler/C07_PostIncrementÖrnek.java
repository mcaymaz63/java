package day05_matematikselislemler;

public class C07_PostIncrementÖrnek {
    public static void main(String[] args) {

        int num1 =9;

        int num2 = num1++;

        if (num2 <  10) {
            System.out.println(num2 + "Hello Word");
        } else {
            System.out.println("Hello üniversal");
        }

    } }