package pckg_coll_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int MAXI = 100;

    public static void addNewUser(User user, HashMap<Integer,String> users){
        if(users.containsKey(user.getUserID())){ //provjeravamo jel user postoji vec
            System.out.println("User already in this map!");
        } else {
            users.put(user.getUserID(),user.getUserName()); //dodajemo usera
            System.out.println("New user added to map!");
        }
    }

    public static <K,V> void listAllMapElements(HashMap<K, V> map){
        System.out.println("-------------------------------------------");
        for(K key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static <K, V> void listAllMapElementsNew(HashMap<K, V> map){
        for(Map.Entry<K, V> entryset : map.entrySet()){
            System.out.println("Key: " + entryset.getKey() + " Value: " + entryset.getValue());
        }
    }

    public static void addElementToSet(Robot element, HashSet<Robot> elements){
        if(elements.add(element)){
            System.out.println("New element added to a set!");
        } else {
            System.out.println("Element already in set!");
    }
}

    public static <E> void listSetElements(Set<E> elements){  //E je parametrizacija da moze bilo koji tip podatka radit
    System.out.println("-----------------------------------------------");
        for(E element: elements){
            System.out.println(element);

         }
    }

    public static <E> void removeElementFromSet(Set<E> elements, E elementToRemove){
        if(elements.remove(elementToRemove)){
            System.out.println("Removed element: " + elementToRemove);
        } else {
            System.out.println("There is no such element in set!");
        }
    }

    public static <K,V> void addRobotToMap(Map<K, V> map, K key, V value){
        if(map.containsKey(key)){
            System.out.println("This is already in map!");
        } else {
            map.put(key, value);
            System.out.println("New robot added to a map!");
        }
    }

    private static int generateRandomGrade(){
        int maxi = 100;
        return ThreadLocalRandom.current().nextInt(0, MAXI);
    }
}