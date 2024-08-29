import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 0 and 999999
        int randomNumber = random.nextInt(1000000);

        System.out.println("Random 6-digit number: " + randomNumber);
    }
}
