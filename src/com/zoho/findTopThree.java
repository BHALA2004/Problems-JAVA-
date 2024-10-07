package com.zoho;

public class findTopThree {

    static void findCount(int unique[],int freq[],int value) {
        int i=0;
        for(i=0;i<unique.length;i++) {
            if(unique[i]==0) {
                unique[i]=value;
                freq[i]=1;
                break;
            }
            if(unique[i]==value) {
                freq[i]+=1;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,7,6,5,3,1,6,7,13,25,3,7,19,9,6,7,10};
        int n=arr.length;
        int[] unique=new int[n];
        int[] frequency=new int[n];
        for(int i=0;i<n;i++) {
            findCount(unique,frequency,arr[i]);
        }
        for(int a:unique) {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int b:frequency) {
            System.out.print(b+" ");
        }
        int topCount=frequency.length;
        for(int i=0;i<5;i++) {
            for(int j=0;j<frequency.length-i-1;j++){
                if(frequency[j]>frequency[j+1]) {
                    int temp=unique[j];
                    int temp1=frequency[j];

                    unique[j]=unique[j+1];
                    frequency[j]=frequency[j+1];

                    unique[j+1]=temp;
                    frequency[j+1]=temp1;
                }
            }
        }
        System.out.println();
        for(int b:frequency){
            System.out.print(b+" ");
        }
        System.out.println();
        for(int b:unique){
            System.out.print(b+" ");
        }


    }
//	static void swap(int unique,int freq[],int ind) {
//		int t=freq[ind];
//		int t1=freq[ind+1];
//		freq[ind]=freq[ind+1];
//		freq[ind+1]=t;
//	}
}