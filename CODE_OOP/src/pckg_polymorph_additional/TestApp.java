package pckg_polymorph_additional;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Tiger());
        animals.add(new Penguin());
        animals.add(new Penguin());

        for (Animal animal : animals){
            animal.drinkWater();
        }
    }
}
