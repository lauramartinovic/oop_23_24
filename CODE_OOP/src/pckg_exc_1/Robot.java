package pckg_exc_1;

public abstract class Robot {

    protected String name;
    protected int id;
    private static int cntID = 10;


    protected Robot(String name){
        this.name = name;
        this.id = cntID++;


    }

    public void turnON(){
        System.out.println("Turning on this robot!");
    }

    public void turnOff(){
        System.out.println("Turning off this robot!");
    }

    public abstract void charge();

    public abstract void changeState();
}
