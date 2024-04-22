package pckg_zadatak_predavanje;

public class PDS_Student extends Student{

    public PDS_Student(String name){

    }
    @Override
    protected void completedStudy(int idStudent) {
        System.out.println("Student " + idStudent + " has completed the study!");

    }
}
