package leetcode75;
import java.util.Arrays;

public class StringCompression {
    public static int compress(char[] chars) {
        int count = 0;
        int index = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                chars[index++] = chars[i];
                count += 1;
                if (count > 1 || i == chars.length - 2) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count=1;
            } else {
                count++;
            }
        }

        // Handle the last character if it's different
        if (count > 0) {
            chars[index++] = chars[chars.length - 1];
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the new length
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength = compress(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(newLength);
    }
}