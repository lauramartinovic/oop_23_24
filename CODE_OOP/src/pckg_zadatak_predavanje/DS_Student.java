package pckg_zadatak_predavanje;

public class DS_Student extends Student{

    public DS_Student(String name){

    }

    @Override
    protected void completedStudy(int idStudent) {
        System.out.println("Student " + idStudent + " has completed the study!");

    }
}
