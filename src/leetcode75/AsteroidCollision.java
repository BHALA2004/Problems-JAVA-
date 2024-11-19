package leetcode75;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int asteroid : asteroids)
        {
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0 && stack.peek()<Math.abs(asteroid))
                stack.pop();


            if (stack.isEmpty() || asteroid > 0 || stack.peek() < 0)
                stack.push(asteroid);
            else if (stack.peek() == Math.abs(asteroid))
                stack.pop();
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
