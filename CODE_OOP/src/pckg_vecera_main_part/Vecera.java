package pckg_vecera_main_part;

import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.Predjelo;

public class Vecera {

    public static void main(String[] args) {

        Predjelo predjelo = new Predjelo("Cezar", "salata", 3);
        GlavnoJelo glavno = new GlavnoJelo();
        Desert desert = new Desert("Sladoled dupli", 2);

        predjelo.pojediPredjelo();
        float cijena = glavno.totalPrice();

    }
}
