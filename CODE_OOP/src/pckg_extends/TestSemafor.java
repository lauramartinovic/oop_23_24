package pckg_extends;

public class TestSemafor {

    public static void main(String[] args) {
        Semafor semafor = new Semafor("0", "0", "1");
        Hacker hacker = new Hacker(semafor);
        System.out.println(semafor);
        semafor.giveSemaforStatus();
        semafor.putSemaforInWork();
        System.out.println(semafor);
        hacker.changeSemaforCode("010");
        semafor.putSemaforInWork();

    }
}
