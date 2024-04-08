package pckg_outsource_vecera;

public class Desert {

    String naziv;
    int kol;

    public Desert(String naziv, int kol){
        this.kol = kol;
        this.naziv = naziv;
    }
    void infoDesert(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", kol=" + kol +
                '}';
    }
}
