package day17_NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // verilen sayiya gore carpim tablosu oilusturalim
        /* input 3
        1 2 3
        2 4 6
        3 6 9
         */
int input=4;
        for (int i=1;i<=3; i++){

            for ( int j=1; j<=3; j++){
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}
