package Hackerrank;

public class FlipBits {
    public static long flippingBits(long n) {
        // Write your code here
        String s = "";
        while (n > 0) {
            long r = n % 2;
            s = String.valueOf(r) + s; // Prepend the binary digit to ensure correct order
            n /= 2;
        }

        // Pad the binary string with leading zeros to ensure it's 32 bits long
        while (s.length() < 32) {
            s = "0" + s;
        }

        // Flip the bits by converting '1' to '0' and '0' to '1'
        StringBuilder flipped = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                flipped.append('0');
            } else {
                flipped.append('1');
            }
        }

        // Convert the flipped binary string back to a long value
        long value = 0;
        long multiply = 1;
        for (int i = flipped.length() - 1; i >= 0; i--) {
            if (flipped.charAt(i) == '1') {
                value += multiply;
            }
            multiply *= 2;
        }

        return value;

    }
    public static void main(String[] args) {
        System.out.println(flippingBits(0));
    }
}
