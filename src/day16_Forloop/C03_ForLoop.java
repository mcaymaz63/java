package day16_Forloop;

public class C03_ForLoop {
    public static void main(String[] args) {
// 10 ile 30 arasindaki sayilari aralarinda virgul koyarak yazdir

        int bas = 10;
        int son = 30;
        for (int i = 10; i <= 30; i++) {
            if (i < son) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }


        }
    }}
