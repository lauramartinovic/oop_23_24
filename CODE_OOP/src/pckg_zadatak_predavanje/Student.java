package pckg_zadatak_predavanje;

import java.text.DateFormat;

public abstract class Student {


    private static final java.text.DateFormat DATE_FORMAT = null;

   protected String enrolmentDate;
   protected String name;
   protected int idStudent;
   protected int cntStudents;

   protected void setEnrolmentDate(){

   }

   protected void infoStudent(){

   }

   protected abstract void completedStudy(int idStudent);
}
