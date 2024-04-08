package pckg_uml;

public class User {

    private int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntID = 100;

    public User(String userName, String mail, String password){

        this.id = cntID++;
        this.userName = userName;
        this.mail = mail;
        this.password = password;


    }

    public boolean activateAccount(){

        return false;
    }

    public boolean logIn(String pswd, String usNme){

        return false; //da se ne crveni
    }
}
