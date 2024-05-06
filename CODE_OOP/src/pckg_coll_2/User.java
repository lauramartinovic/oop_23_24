package pckg_coll_2;

public class User {

    private int userID;
    private String userName;
    private String password;

    public User(String userName, String password, int id){
        this.password = password;
        this.userID = id; //zašto ovdi nije potrebno this?
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
