package day35_InheritiancedaConstructor;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("KDizelCorolla parametresiz cons");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");
    }
    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("Hasan");
    }

}
