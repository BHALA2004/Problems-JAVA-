package com.zoho;

public class Sum_Product {
    public static void main(String[] args) {
        int[] m = {120,24,71};
        for(int i = 0;i<m.length;i++){
            int k = m[i];int sum = 0;int product = 1;
            while (k>0){
                int rem = k%10;
                sum+=rem;
                product*=rem;
                k/=10;


            }
            if(sum>product){
                System.out.println(sum+" ");
            }else {
                System.out.println(product+" ");
            }

        }
    }
}
