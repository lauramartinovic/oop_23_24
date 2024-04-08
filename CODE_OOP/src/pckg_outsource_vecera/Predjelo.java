package pckg_outsource_vecera;

public class Predjelo {

    private String naziv;
    private String vrsta;
    private int kol;

    public Predjelo(String naziv, String vrsta, int kol){
        this.kol = kol;
        this.naziv = naziv;
        this.vrsta = vrsta;
    }

    public void pojediPredjelo(){
        System.out.println("Pojedeno: " + getClass().getSimpleName() + "|" + naziv + "|" + "kol: " + kol);
    }

    public int kojaKolicina(){
        return kol;
    }
}
