package pckg_polymorph;

public class Tiger extends Animal{

    @Override
    public void makeSomeSound() {
        System.out.println(getClass().getSimpleName() + " making some sound characteristic for a Tiger!");
    }
}
