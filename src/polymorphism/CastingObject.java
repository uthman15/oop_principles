package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        /*
        Up-casting
        -putting smaller data into bigger - widening
        -it happens implicitly
         */

        Animal animal1 = new Cat(); // up-casting Cat in the shape of Animal
        Object object1 = new Cat(); // up-casting Cat in the shape of Object

        List<Animal> animals = new ArrayList<>(); // up-casting ArrayList in the shape of List

        /*
        down-casting
        -putting bigger data into smaller
        -happens explicitly
        BUT: There could be data loss with primitives
        There can be Exception thrown with object if done improperly
         */

        /*
        Dog dog1 = (Dog)new Animal();
        System.out.println(dog1);

        Immediate use of down-casting is not possible, and you will get ClassCastException with that.
        DO NOT TRY IT THIS WAY
         */

        Animal a1 = new Dog(); // This is a Dog in the shape of Animal (up-casted)
        Dog dog1 = (Dog) a1; // Down-casting Dog back to Animal

        a1.eat(); // Dog eats
        dog1.eat(); // Dog eats

    }
}
