package day15_OverloadingForLop;

public class C07_ForLoop {
    public static void main(String[] args) {

      C06_StringTerstenCevirme.terstenYazdir("mevlit");
      // 100 den 1`e kadar (sinirlar dahil ) 8 ile bolebilen sayilari yazdiriniz

        for (int i=100; i>=1;i--){

            if (i%8==0){
                System.out.println(i+" ");
            }
        }


    }
}
