package nestedloops;

public class Main {

    public static void main(String[] args) {

        //5 puta izvrsavamo unutarnju petlju

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
