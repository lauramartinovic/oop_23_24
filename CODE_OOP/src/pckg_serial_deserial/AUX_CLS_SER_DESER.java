package pckg_serial_deserial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AUX_CLS_SER_DESER {

    public static <T> void saveObjToFile(String filePath, T someObject) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(someObject);
            System.out.println("Object written to the file.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> void saveMultipleObjToFile(String filePath, List<E> objects) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            for (E element : objects) {
                oos.writeObject(element);
                System.out.println("Object written to the file.");
            }

            System.out.println("All objects are written to a file!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    public static SpaceShip readSpaceShipFromFile(String filePath){
        SpaceShip spaceShip = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))){
            spaceShip = (SpaceShip) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return spaceShip;
    }

    public static <E> List<E> readObjectsFromFile(String filePath){
        List<E> elements = new ArrayList<>();

        try(FileInputStream fis = new FileInputStream(new File(filePath))){


            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(fis.available());

            while(fis.available() > 0 ){
                E someElement = (E) ois.readObject();
                elements.add(someElement);
                System.out.println("One element from file is added to a list");
            }

            System.out.println("All elements from file are recovered");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return elements;
    }

}