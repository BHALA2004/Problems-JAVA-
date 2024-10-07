package com.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class leftstar {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int start=1;
        for(int i = 1;i<=n;i++){
            int temp = start;
            for(int j = i ;j<=n;j++){
                System.out.print(temp+" ");
                temp+=i+j;
            }
            start+=i;
            System.out.println();
        }

  }

    }

