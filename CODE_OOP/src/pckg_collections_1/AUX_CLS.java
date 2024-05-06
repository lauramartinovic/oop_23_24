package pckg_collections_1;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;


public class AUX_CLS {
    public static <E> void addElementToList(List<E> lista, E element){
        lista.add(element);
    }

    public static <E> void addElementToTreeSet(TreeSet<E>set, E element){
        set.add(element);
    }

    public static <E> void listElementsFromTreeSet(TreeSet<E>set){
        for (E element : set){
            System.out.println(element);
        }
    }

    public static <V, K> void addValueInMap(HashMap<K,V>elements, V value, K key){
        elements.put(key, value);
    }


    public static <E> void listAllElementsInList(List<E>list){
        for (E element : list){
            System.out.println(element);
        }
    }

    public static <K, V> void listAllFromMap(HashMap<K,V>map){
        for (K k: map.keySet()){
            System.out.println("Key: "+ k + "| Value: "+ map.get(k));
        }
    }
}
