package guessinggame;

public class Player {

    int number = 0; // ovdje se pohranjuje pokušaj

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number); // ovdje se ispisuje pokušaj

    }
}
