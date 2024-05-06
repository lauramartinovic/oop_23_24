package dvdexcercise;

public class DVDTest {

    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRec = true;
        d.playDVD();

        if (d.canRec == true) {
            d.recDVD();
        }
    }
}
