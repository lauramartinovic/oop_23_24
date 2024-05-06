package pckg_coll_2;

import java.util.HashMap;

public class ClientApp {

    public static void main(String[] args) {

        User user1 = new User("user_name-1", "pass1",15);
        User user2 = new User("user_name-2", "pass2",100);
        User user3 = new User("user_name-3", "pass3",345);

        HashMap<Integer,String> users = new HashMap<>(); //kreiramo hashmapu

        AUX_CLS.addNewUser(user1,users);
        AUX_CLS.addNewUser(user1,users);
        AUX_CLS.addNewUser(user2,users);
        AUX_CLS.addNewUser(user3,users);
        AUX_CLS.listAllMapElements(users);
        AUX_CLS.listAllMapElementsNew(users);
    }
}
