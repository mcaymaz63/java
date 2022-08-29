package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("caymaz");

        sb.substring(0,3);
        // bu metohod string dondurdugu icin stringBulder in eski halini degistirmez

        System.out.println(sb);// caymaz

        sb.subSequence(0,3);// caymaz
    }
}
