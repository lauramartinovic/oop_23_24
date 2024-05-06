package pckg_coll_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("auto");
        list.add("karić");
        list.add("romobil");
        list.add("bicikla");
        list.add("brod");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        LengthStringComparator lengthStringComparator = new LengthStringComparator();
        Collections.sort(list, lengthStringComparator);
        System.out.println(list);

    }

}
