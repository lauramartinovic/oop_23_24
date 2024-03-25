package pckg_arrays;

import java.util.Arrays;

public class TestArr {

    public static void main(String[] args) {
        int[] arr = AUX_CLS.populateArrayRand(5); //testiranje klase
        //System.out.println(Arrays.toString(arr)); //ispis reference na objekt u memoriji ako nemamo Arrays.toString

        AUX_CLS.listIntArray(arr);
        //AUX_CLS.userPopulatedArray(4);

        String[] strArr = {"Vasa", "vana plurium", "sonant"};
        String linked = AUX_CLS.linkStringsUsingJoin(strArr);
        System.out.println(linked);
        String sbLinked = AUX_CLS.linkUsingStringBuilder(strArr);
        System.out.println(sbLinked);
        String concate = AUX_CLS.concatenateArrayElements(strArr);
        System.out.println(concate);
        int[][] arr2d = AUX_CLS.gen2DIntArray(3,4);
        System.out.println(Arrays.deepToString(arr2d)); //ispis reference na objekt u memoriji ako nemamo Arrays.toString
        AUX_CLS.list2DArray(arr2d);

    }
}
