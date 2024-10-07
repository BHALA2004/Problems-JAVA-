package com.zoho;

import java.util.Scanner;
import java.util.Random;

public class kmmak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4;
        int m = 4;
        int [][]tiles = new int[n][m];
        initializePuzzle(n, m,tiles);
        while(true) {
            System.out.print("Enter the tile to move:");
            int value = input.nextInt();
            if(value == -1) {
                System.out.println("Exiting game");
                break;
            }
            int tiles1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
            if(tiles==tiles1) {
                System.out.println("You won!!");
            }
            if(value<=15 && value>=1) {
                if(isValid(tiles,n,m,value)) {
                    makemove(n,m,tiles,value);
                }
                else {
                    System.out.println("Enter the valid move plese!");
                }
            }
            else {
                System.out.println("Enter the valid number between 1 and 15");
            }
        }

    }

    public static void initializePuzzle(int n, int m,int[][] tiles) {
        int tile = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tile == n * m) {
                    tiles[i][j] = 0;
                } else {
                    tiles[i][j] = tile++;
                }
            }
        }
        shuffle(tiles,m,n);
        printpuzzle(n,m,tiles);
    }
    public static void shuffle(int[][] tiles,int n,int m) {
        Random rand = new Random();
        for(int i=n-1;i>=0;i--) {
            for(int j=m-1;j>=0;j--) {
                int n1=rand.nextInt(i+1);
                int m1 = rand.nextInt(j+1);
                int temp =  tiles[i][j];
                tiles[i][j]= tiles[n1][m1];
                tiles[n1][m1]= temp;
            }
        }
    }
    public static boolean isValid(int[][] tiles,int n,int m,int value) {
        int blankrow = -1; int blankcol = -1;
        int tilerow = -1;int tilecol = -1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(tiles[i][j]==0) {
                    blankrow = i;
                    blankcol = j;
                }
                if(tiles[i][j]==value) {
                    tilerow = i;
                    tilecol = j;
                }
            }
        }
        if((tilecol==blankcol && Math.abs(tilerow-blankrow)==1)||(tilerow==blankrow && Math.abs(tilecol-blankcol)==1)) {
            System.out.println("Valid move");
            return true;
        }
        return false;
    }
    public static void makemove(int n,int m,int[][]tiles,int value) {
        int blankrow = -1; int blankcol = -1;
        int tilerow = -1;int tilecol = -1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(tiles[i][j]==0) {
                    blankrow = i;
                    blankcol = j;
                }
                if(tiles[i][j]==value) {
                    tilerow = i;
                    tilecol = j;
                }
            }
        }
        tiles[blankrow][blankcol]=value;
        tiles[tilerow][tilecol]=0;
        printpuzzle(n,m,tiles);
    }
    public static void printpuzzle(int n,int m,int[][]tiles) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + tiles[i][j]);
            }
            System.out.println();
        }
    }

}