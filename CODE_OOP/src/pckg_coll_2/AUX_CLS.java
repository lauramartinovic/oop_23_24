package pckg_coll_2;

import java.util.HashMap;
import java.util.Map;

public class AUX_CLS {

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
            System.out.println("ID: " + key + " UserName: " + map.get(key));
        }
    }
    public static <K, V> void listAllMapElementsNew(HashMap<K, V> map){
        for(Map.Entry<K, V> entryset : map.entrySet()){
            System.out.println("Key: " + entryset.getKey() + " Value: " + entryset.getValue());
        }
    }
}
