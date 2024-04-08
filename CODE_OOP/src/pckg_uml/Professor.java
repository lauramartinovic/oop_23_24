package pckg_uml;

//nova metoda ili override postojece metode

import java.util.ArrayList;

public class Professor extends Person{

    private ArrayList<Student> students;

    private Student student;

    public Professor(String name, String surname){
        super(name, surname);
        students = new ArrayList<>();
        System.out.println(this.getClass().getSimpleName() + " constructor called!");
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void performConsultation(){
        System.out.println(this.getClass().getSimpleName() + " gives consultative lecture to the students!");
        student.askQuestion();
        for(Student student : students){
            student.askQuestion();
        }
    }
}
