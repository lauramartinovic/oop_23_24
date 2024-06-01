package pckg_serial_deserial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip implements Serializable, EqualsSpaceShips{

    private String spaceShipName;
    private int id;
    private static int cntID = 10;
    private LocalDate firstMissionDate;
    private int numMissions;
    private static final int STARTYEAR = 2000;
    private static final int MINI = 1;
    private static final int MAXI = 1000;

    public SpaceShip(String name){

        this.spaceShipName = name;
        this.id = cntID++;
        this.firstMissionDate = generateRandomFirstMissionDate();
        this.numMissions = ThreadLocalRandom.current().nextInt(MINI, MAXI);
    }

    private LocalDate generateRandomFirstMissionDate(){

        LocalDate startDate = LocalDate.of(STARTYEAR, 1, 1);
        LocalDate endDate = LocalDate.now();
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();
        long random = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();

        return LocalDate.ofEpochDay(random);

    }


//    @Override
//    public boolean equals(Object obj) { //metoda samo za objekte
//
//        int thisID = this.id;
//        String name = this.spaceShipName;
//        int otherID = obj.
//        return false;
//    }


    public String getSpaceShipName() {
        return spaceShipName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "spaceShipName='" + spaceShipName + '\'' +
                ", id=" + id +
                ", firstMissionDate=" + firstMissionDate +
                ", numMissions=" + numMissions +
                '}';
    }

    @Override
    public boolean equalsSpaceShip(SpaceShip thisSpaceShip, SpaceShip otherSpaceShip) {
          return this.id == otherSpaceShip.id && this.spaceShipName.equals(otherSpaceShip.spaceShipName);
    }


    }


