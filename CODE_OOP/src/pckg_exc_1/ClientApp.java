package pckg_exc_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            double num;
            System.out.println("Enter:");
            num = scanner.nextDouble();
            System.out.println("Entered: " + num);
        } catch (InputMismatchException ime){
            System.out.println("Wrong input for scanner!");
        }
    }
}
