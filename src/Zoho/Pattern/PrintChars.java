package Zoho.Pattern;

public class PrintChars {
    public static void printChars(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        String s = "a2b10c20";
        String currentChar = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                currentChar = String.valueOf(s.charAt(i)); // Store the current character
            } else {
                String numberStr = "";
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    numberStr += s.charAt(i); // Accumulate digits
                    i++;
                }
                int n = Integer.parseInt(numberStr);
                printChars(currentChar, n); // Print the character `n` times
                i--; // Adjust the index to account for the outer loop increment
            }
        }
    }
}
