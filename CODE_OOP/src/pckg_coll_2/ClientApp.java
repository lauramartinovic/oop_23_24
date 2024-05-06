package pckg_coll_2;

import java.util.*;

public class ClientApp {

    public static void main(String[] args) {

//        User user1 = new User("user_name-1", "pass1",15);
//        User user2 = new User("user_name-2", "pass2",100);
//        User user3 = new User("user_name-3", "pass3",345);
//
//        HashMap<Integer,String> users = new HashMap<>(); //kreiramo hashmapu
//
//        AUX_CLS.addNewUser(user1,users);
//        AUX_CLS.addNewUser(user1,users);
//        AUX_CLS.addNewUser(user2,users);
//        AUX_CLS.addNewUser(user3,users);
//        AUX_CLS.listAllMapElements(users);
//        AUX_CLS.listAllMapElementsNew(users);
//
//        HashSet<String> hset = new HashSet<>();
//        LinkedHashSet<String> lhset = new LinkedHashSet<>();
//        TreeSet<String> tset = new TreeSet<>();
//        AUX_CLS.addElementToSet("Otvoreni", hset);
//        AUX_CLS.addElementToSet("Kod", hset);
//        AUX_CLS.addElementToSet("Linux", hset);
//        AUX_CLS.addElementToSet("Kripto", hset);
//        AUX_CLS.addElementToSet("Otvoreni", lhset);
//        AUX_CLS.addElementToSet("Kod", lhset);
//        AUX_CLS.addElementToSet("Linux", lhset);
//        AUX_CLS.addElementToSet("Kripto", lhset);
//        AUX_CLS.addElementToSet("Otvoreni", tset);
//        AUX_CLS.addElementToSet("Kod", tset);
//        AUX_CLS.addElementToSet("Linux", tset);
//        AUX_CLS.addElementToSet("Kripto", tset);
//
//        AUX_CLS.listSetElements(hset);
//        AUX_CLS.listSetElements(lhset);
//        AUX_CLS.listSetElements(tset);
//        AUX_CLS.removeElementFromSet(tset, "Linux");
//        AUX_CLS.listSetElements(tset);

        HashSet<Robot> robots = new HashSet<>();
        AUX_CLS.addElementToSet(new Robot("flying robot"), robots);
        AUX_CLS.addElementToSet(new Robot("weird robot"), robots);
        AUX_CLS.addElementToSet(new Robot("cleaning robot"), robots);
        AUX_CLS.addElementToSet(new Robot("thinking robot"), robots);
        HashMap<Robot, Integer> robotsMap = new HashMap<>();
        AUX_CLS.addRobotToMap(robotsMap,new Robot("flying robot"), 30);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("weird robot"),74);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("cleaning robot"), 100);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("thinking robot"), 57);
        AUX_CLS.listAllMapElements(robotsMap);

    }
}
