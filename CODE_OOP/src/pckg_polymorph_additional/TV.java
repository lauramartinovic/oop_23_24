package pckg_polymorph_additional;

public class TV extends Device{

    public TV(){
        System.out.println("Constructor called for : " + getClass().getCanonicalName());
    }

    @Override
    public void turnON() {
        System.out.println("Turning on TV using remote controller!");
    }

    public void changeProgram(){
        System.out.println("Can change program using remote controller!");
    }
}
