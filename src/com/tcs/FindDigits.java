package com.tcs;

public class FindDigits {
    public static int counting(int val,int rem){
        if(val%rem==0){
            return 1;
        }
        return 0;
    }
    public static int findDigits(int n) {
        // Write your code here
        int k = n;int count = 0;
        while (n>0){
            int rem = n%10;
            if(rem!=0){
                count+=counting(k,rem);
            }
            n/=10;

        }
        return count;

    }
    public static void main(String[] args) {
        int n =12;
        System.out.println(findDigits(n));
    }
}
