package pckg_extends;

public class Semafor {

    private String zeleno;
    private String zuto;
    private String crveno;
    private String code;

    private static final String[] CODES = {"100", "010", "001"};

    public Semafor(){
        this.zeleno = "1";
        this.zuto = "0";
        this.crveno = "0";
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public Semafor(String ze, String zu, String cr){
        this.crveno = cr;
        this.zuto = zu;
        this.zeleno = ze;
        this.code = this.zeleno + this.zuto + this.crveno;
    }


    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "zeleno='" + zeleno + '\'' +
                ", zuto='" + zuto + '\'' +
                ", crveno='" + crveno + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    private boolean checkCode(){
        for(String elCode : CODES){
            if (code.equals(elCode)){
                return true;
            }
        }
        return false;
    }

    public void giveSemaforStatus(){
        if (checkCode()){
            switch (code){
                case "100":
                    System.out.println("prolaz"); break;
                case "010":
                    System.out.println("oprez"); break;

                case "001":

                    System.out.println("stoj"); break;

                default:
                    System.out.println("greska koja nikad nece biti..");
            }

        } else {
            System.out.println("Pogrešan kod semafora - koristite novi kod!");
        }
    }

    public void putSemaforInWork(){
        int cnt = 0;
        while(cnt < 10){
            giveSemaforStatus();
            int idx = (cnt+1)%3;
            System.out.println(idx);
            this.code = CODES[idx];
            cnt++;
        }
    }
}
