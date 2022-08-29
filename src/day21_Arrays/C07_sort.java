package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[] sayilar={5,7,1,6,4,7,9};
        // Arrayi arrays class ini kullanarak sirali hale getirebiliriz
        Arrays.sort(sayilar);// sort sirala anlama geliyor
        System.out.println(Arrays.toString(sayilar));//[1, 4, 5, 6, 7, 7, 9]
    }
}
