interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Bird extends Animal {
    void chirp() {
        System.out.println("Chirping...");
    }
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

class Penguin extends Bird implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming...");
    }
}

public class LSPTest {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        sparrow.eat();
        sparrow.chirp();
        sparrow.fly();

        penguin.eat();
        penguin.chirp();
        penguin.swim();

        
    }
}
