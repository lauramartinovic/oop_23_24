package pckg_serial_deserial;

import java.util.ArrayList;
import java.util.List;

public class TestSpaceShipApp {

    public static void main(String[] args) {
        SpaceShip spaceShip1 = new SpaceShip("Millenium Falcon");
        SpaceShip spaceShip2 = new SpaceShip("Enterprise");
        SpaceShip spaceShip3 = new SpaceShip("ES-100");

        System.out.println(spaceShip1);

        AUX_CLS_SER_DESER.saveObjToFile("space.bin", spaceShip1);

        List<SpaceShip> ships = new ArrayList<>();
        ships.add(spaceShip1);
        ships.add(spaceShip2);
        ships.add(spaceShip3);
        System.out.println(ships);

        AUX_CLS_SER_DESER.saveMultipleObjToFile("multiShips.bin", ships);
        SpaceShip spaceShipFromFile = AUX_CLS_SER_DESER.readSpaceShipFromFile("space.bin");
        System.out.println(spaceShipFromFile);

        System.out.println("Recovered: " + Integer.toHexString(spaceShipFromFile.hashCode()));
        System.out.println("Original: " + Integer.toHexString(spaceShip2.hashCode()));

        System.out.println(spaceShip2.equals(spaceShipFromFile));

        boolean eq = spaceShip2.equalsSpaceShip(spaceShip2, spaceShipFromFile);
        System.out.println(eq);

        SpaceShip shipNew = AUX_CLS_SER_DESER.readSpaceShipFromFile("space.bin");
        ships.clear();
        ships = AUX_CLS_SER_DESER.readObjectsFromFile("multiships.bin");
    }
}
