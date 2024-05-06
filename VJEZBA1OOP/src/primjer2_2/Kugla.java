package primjer2_2;

import java.util.Scanner;

public class Kugla {

    //racunanje volumena kugle

    public static void main(String[] args) {

        double volumen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite radijus: ");
        double r = sc.nextDouble();
        System.out.println("4 / 3: " + 4.0/3);
        volumen = (4/3)*Math.PI*Math.pow(r,3);
        System.out.println(volumen);


    }
}
