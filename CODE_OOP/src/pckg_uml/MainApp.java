package pckg_uml;

public class MainApp {

    public static void main(String[] args) {
        Person person = new Person("Matija", "Martinic");
        Student stu = new Student("Eva", "Franic");
        Professor prof = new Professor("Stipe", "Veric");

        prof.setStudent(stu);

        prof.performConsultation();
    }
}
