package day16_Forloop;

public class C01_foorLoop {
    public static void main(String[] args) {
// verilen bir pozitif tam sayinin
// tam bolenlerini yazdirali



    int input=20;

    for (int i=1; i <=input; i++){

        if (input%i==0){
            System.out.println(i+" ");
        }
    }
    }
}
