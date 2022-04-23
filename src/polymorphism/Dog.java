package polymorphism;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog barks");
    }

    public void eat(){
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
    public void sleep(int hour){
        System.out.println("Dog sleeps " + hour + "hours");
    }
}
