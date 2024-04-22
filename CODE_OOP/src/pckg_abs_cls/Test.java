package pckg_abs_cls;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ime1", "Prezime1", "UniZD", "IT");
        st1.getSignature();
        st1.getInfo();
        SuperHero sh1 = new SuperHero("Name2", "Sname22", "Super1");
        sh1.flyAroundTown();
        sh1.getSignature();
        sh1.haveEnormousStrength(10);
    }
}
