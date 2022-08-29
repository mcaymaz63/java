package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String>list= new ArrayList<>();

        list.add("kenen");
        list.add("enes");
        list.add("ismail");
        System.out.println(list);

        list.set(1,"yasemin");
        System.out.println(list);

        list.set(2,"mevlit");
        System.out.println(list);

        list.remove("ismail");
        System.out.println(list);
    }
}
