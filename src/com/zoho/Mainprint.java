package com.zoho;

import java.util.Scanner;

public class Mainprint {

    public static void main(String[] args) {
        int n=4;
        int initialValue=1;
        int tsize=n;
        for(int i=0;i<n;i++) {
            int rowstart=initialValue;
            for(int j=0;j<n;j++) {
                if(n-i-1<=j) {
                    System.out.print(rowstart+"  ");
                    rowstart-=(j+1);
                }else {
                    System.out.print("    ");
                }
            }
            initialValue+=tsize--;
            System.out.println();
        }
    }
}
