public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting: Animal reference pointing to Dog object

        // Check type before downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // Downcasting: Animal reference is cast back to Dog reference
            dog.makeSound();         // Output: Dog barks
            dog.wagTail();           // Output: Dog wags tail
        } else {
            System.out.println("The animal is not a dog.");
        }
    }
}