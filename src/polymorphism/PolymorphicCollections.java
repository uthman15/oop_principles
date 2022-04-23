package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-----Cat Object-----\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");


        System.out.println("\n-----Dog Object-----\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n-----Animal Object-----\n");
        Animal animal1 = new Animal();
        animal1.eat(); // Animal eats
        animal1.eat("some food"); //Animal eats some food
        animal1.sleep(); // Animal sleeps

        System.out.println("\n-----Cat and Dog Objects in Animal Shape-----\n");
        Animal animal2 = new Cat();
        animal2.eat();
        animal2.sleep();

        Animal animal3 = new Dog();
        animal3.eat();
        animal3.sleep();

        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }

        /*
        Cat
        Dog
        Animal
        Cat
        Dog
         */

       // Store all objects in an ArrayList and execute eat() method for each object

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        for (Animal animal : animalArrayList) {
            animal.eat();
        }
    }
}
