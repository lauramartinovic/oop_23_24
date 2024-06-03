package pckg_exc_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentCLS {

    public static void readFromFile(String filePath){
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
