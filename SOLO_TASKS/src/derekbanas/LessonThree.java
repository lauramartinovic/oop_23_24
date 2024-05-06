package derekbanas;

public class LessonThree {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 50 );

        if (randomNumber < 25) {
            System.out.println("The random is less than 25");
        }
    }
}
