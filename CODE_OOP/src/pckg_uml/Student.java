package pckg_uml;


//nasljeđivanje

public class Student extends User{
    public Student(String userName, String mail, String password) {
        super(userName, mail, password);
    }


    @Override
    public boolean activateAccount() {
        return super.activateAccount();
    }

    public int getExam(String course){

        return 5;
    }
}
