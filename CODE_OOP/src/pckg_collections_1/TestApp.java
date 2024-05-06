package pckg_collections_1;

import pckg_polymorph.AI_Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class TestApp {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        TreeSet<AI_Entity> set = new TreeSet<>();
        AUX_CLS.addElementToTreeSet(set,new AI_Entity("RT-34"));
        AUX_CLS.addElementToTreeSet(set,new AI_Entity("GH-55"));
        AUX_CLS.addElementToTreeSet(set,new AI_Entity("EE-H7"));
        AUX_CLS.listElementsFromTreeSet(set);
//        AUX_CLS.addElementToList(lista,"Neki string");
//        AUX_CLS.addElementToList(lista,"300");
//        HashMap<Integer,String> map = new HashMap<>();
//        AUX_CLS.addValueInMap(map,"Prvi",1);
//        AUX_CLS.listAllElementsInList(lista);
//        AUX_CLS.listAllFromMap(map);
//        AUX_CLS.addValueInMap(map,"NOVI-CHANGE",1);
//        AUX_CLS.listAllFromMap(map);

    }
}
