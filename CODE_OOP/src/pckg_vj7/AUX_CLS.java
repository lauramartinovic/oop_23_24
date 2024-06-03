package pckg_vj7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class AUX_CLS {

    public static void readDataFromFile(String filePath, Scanner scanner) {
        LinkedList<String> list = new LinkedList<>();
        File file = new File(filePath);

        try{
            scanner = new Scanner(file);

        } catch (FileNotFoundException fnf){
            System.out.println("File not found...");
        }


    }
}
