package pckg_arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class AUX_CLS {

    private static final int MINI = 10;
    private static final int MAXI = 450;

    private static Scanner scanner = new Scanner(System.in); //ulaz preko tipkovnice


    //Slucajni brojevi
    public static int[] populateArrayRand(int arrSize){
        int[] arr = new int[arrSize]; //inicijalzirali defaultnu vrijednost null

        for(int k = 0; k < arrSize; k++){
            int numElement = ThreadLocalRandom.current().nextInt(MINI, MAXI); //java api za dohvacanje broja
            arr[k] = numElement;
        }

        return arr; //vraca niz s nulama za sad

    }

    //ispis elemenata niza
    public static void listIntArray(int[] arr){
        int size = arr.length;
        for(int k = 0; k < size; k++){
            System.out.println("Element: " + arr[k]);
        }
    }

    //metoda koja puni int niz korisnickim unosom

    public static int[] userPopulatedArray(int size){
        int[] arr = new int[size];
        int idx = 0; //privremeni index

        while(idx < size){
            System.out.println("Please enter one int number: ");
            int num = AUX_CLS.getIntFromStandardInput();
            arr[idx] = num;
            idx++;
        }
        return arr;
    }

    private static int getIntFromStandardInput(){
        int num = 0;
        boolean correctInputRepeat = true;

        while(correctInputRepeat){
        try{
            num = scanner.nextInt();
            correctInputRepeat = false;

        }catch (InputMismatchException ime) {
            System.out.println("Expected input is integer!");
            System.out.println("Please provide new input - integer: ");
            scanner.nextLine();

        }

        }
        return num;
    }

    public static String linkStringsUsingJoin(String[] strArr){
        String linked = String.join(" ", strArr);

        return linked;
    }

    public static String linkUsingStringBuilder(String[] strArr){
        StringBuilder sb = new StringBuilder();
        for(String element: strArr){ //za svaki string unutar iterabilne strukture
            sb.append(element);
            sb.append(" ");

        }

        return sb.toString();
    }

    public static String concatenateArrayElements(String[] strArr){
        String con = " ";
        for(String el : strArr){
            con = con + " " + el;
        }

        return con;
    }

    public static int[][] gen2DIntArray(int rows, int columns){
        int[][] arr2d = new int[rows][columns];
        for(int k = 0; k < rows; k++){
            for(int p = 0; p < columns; p++){ //unutarnja petlja se prva izvrti do kraja
                int num = ThreadLocalRandom.current().nextInt(MINI, MAXI);
                arr2d[k][p] = num;

            }
        }
        return arr2d;
    }

    public static void list2DArray(int[][] arrd){
        for(int[] rw: arrd){
            System.out.println(Arrays.toString(rw));
        }
    }
}
