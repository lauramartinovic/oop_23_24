package pckg_polymorph_additional;

public class Tiger implements Animal{
    @Override
    public void makeSomeSound() {
        System.out.println(getClass().getSimpleName() + " making a Tiger noise");
    }

    @Override
    public void runFast() {
        System.out.println(getClass().getSimpleName() + " is running");

    }

    @Override
    public void drinkWater() {
        System.out.println(getClass().getSimpleName() + " is drinking water");

    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + " is going to sleep");

    }

    public void catchAPray(){
        System.out.println(getClass().getSimpleName() + " can catch a pray!");
    }
}
