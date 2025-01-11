class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
//        Dog dog = new Dog();  // Dog reference pointing to a Dog object
        Animal animal = new Dog();  // Upcasting: Dog reference is converted to Animal reference

        animal.makeSound();   // Output: Dog barks
       // animal.wagTail();  // Compilation error: Animal reference doesn't know about wagTail()
    }
}