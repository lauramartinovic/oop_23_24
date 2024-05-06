package dogarray;

import java.util.Arrays;

public class Dog {

    String name;

    public static void main(String[] args) {

        //pravimo dog objekte i pristupamo im
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Loki";

        //dog array
        Dog[] myDogs = new Dog[3];

        //stavljamo pse unutra
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;


        //pristupamo im koristeci array, reference
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        //govorimo svim psima da laju kroz petlju 
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }
}
