package pckg_polymorph_additional;

public class Penguin  implements Animal{
    @Override
    public void makeSomeSound() {
        System.out.println(getClass().getSimpleName() + " is making a penguin sound");
    }

    @Override
    public void runFast() {
        System.out.println(getClass().getSimpleName() + " is running!");

    }

    @Override
    public void drinkWater() {
        System.out.println(getClass().getSimpleName() + " is drinking");

    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + " is going to sleep");

    }

    public void catchAFish(){
        System.out.println(getClass().getSimpleName() + " is catching a fish");
    }
}
