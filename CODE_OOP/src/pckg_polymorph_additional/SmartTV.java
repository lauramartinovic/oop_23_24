package pckg_polymorph_additional;

public class SmartTV extends TV{

    public SmartTV(){
        System.out.println("Smart TV constructor called for: " + getClass().getSimpleName());
    }

    @Override
    public void turnON() {
        System.out.println("Turning on using smart phone");
    }

    @Override
    public void changeProgram() {
        System.out.println("Changing program again using smart phone");
    }

    public void connectToInternet(){
        System.out.println(getClass().getSimpleName() + " cant establish connection");
    }
}
