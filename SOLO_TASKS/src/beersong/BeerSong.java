package beersong;

public class BeerSong {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = (beerNum == 1) ? "bottle" : "bottles"; //Ovdje se koristi ternarni operator (? :) kako bi se provjerilo je li beerNum jednak 1. Ako jest, word će biti postavljen na "bottle", inače će biti postavljen na "bottles".
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                word = (beerNum == 1) ? "bottle" : "bottles";
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } //end else
        } // end while

    } // end main

} //end class
