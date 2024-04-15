package pckg_agregation;

import java.util.ArrayList;

public class FleetVehicle {

    private String company;
    private int companyID;
    private static int cntID = 300;

    private final ArrayList<Vehicle> vehicles; //final za referencu objekta, pomocu settera ne mozemo dobit drugu array listu

    public FleetVehicle(String company){
        this.company = company;
        this.companyID = cntID++;
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            System.out.println("this vehicle exists already!");
        } else {
            vehicles.add(vehicle);
            System.out.println("added new one");

        }

    }

    public void removeVehicle(Vehicle vehicle){

        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Vehicle: " + vehicle + "removed from the list");
        } else {
            System.out.println("cant remove the vehicle - not in the list");
        }
    }


}
