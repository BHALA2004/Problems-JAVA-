package com.tcs;

public class HowManyGames {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int val = 0; // Number of games
        while (s >= p) { // Check if the budget allows for the current game's price
            s -= p;      // Deduct the price of the current game from the budget
            val++;       // Increment the count of games purchased
            p = Math.max(p - d, m); // Decrease the price but ensure it does not go below the minimum
        }
        return val;

    }
    public static void main(String[] args) {
       int p =  30 , d = 7,m= 10,s= 100;
       int res = howManyGames(p,d,m,s);
        System.out.println(res);
    }
}
