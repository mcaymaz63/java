package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {


        String cumle= "Java buyuk ,dunya kucuk";
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());



        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());




        }
    }
}
