package day17_NestedForLoop;

public class C10 {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=10;



        while (!dogruMu){

            if (sayi>20){ // sart sagladiginda  while loop un condition i false olmali
                System.out.println("Bu islem tamam");
                dogruMu=true;
            }else { // sart saglandigi muddetce while loop un kontrol ettigi degisken degismeli
                System.out.println("islem sart saglamamdi"+sayi);
                sayi++;
            }
        }
    }
}
