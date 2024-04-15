package pckg_agregation;

public class Vehicle {

    private String model;
    private int id;
    private static int cntID = 100;
    private String regPlate;

    public Vehicle(String model){
        this.id = cntID++;
        this.model = model;
    }

    private String genRegPlate(){
        return getClass().getSimpleName()+ "@" + id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", regPlate='" + regPlate + '\'' +
                '}';
    }
}
