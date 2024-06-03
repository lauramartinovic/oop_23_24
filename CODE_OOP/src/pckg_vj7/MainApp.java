package pckg_vj7;

import pckg_coll_2.LengthStringComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class MainApp {

    private static final int MINI = 10;
    private static final int MAXI = 300;


    public static void main(String[] args) {
        ArrayList<String> vehs = new ArrayList<>();
        vehs.add("auto");
        vehs.add("kamion");
        vehs.add("helikopter");
        vehs.add("jedrilica");
        vehs.add("bicikla");
        vehs.add("romobil");
        vehs.add("avion");
        System.out.println(vehs);
        Collections.sort(vehs, new StringLengthComparator());
        System.out.println(vehs);
        ArrayList<Integer> numInts = generateListInt(8);
        System.out.println(numInts);
        Collections.sort(numInts);
        System.out.println(numInts);
        Collections.sort(numInts, new ReverseIntComparator());
        System.out.println(numInts);
    }

    private static int generateRandomInt(){



        return ThreadLocalRandom.current().nextInt(MINI, MAXI+1);

    }

    private static ArrayList<Integer> generateListInt(int numInts){
        ArrayList<Integer> nums = new ArrayList<>();

        for(int k = 0; k < numInts; k++){
            nums.add(generateRandomInt());
        }

        return nums;
    }
}
