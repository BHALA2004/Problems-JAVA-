package Zoho.Pattern;

import java.util.Arrays;

public class UptoThirdLargest {
    public static void main(String[] args) {
        int[] arr = {5,5,5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i){
                thirdMax=secondMax;
                secondMax=max;
                max=i;
            }
            if(max>=i){
                if(secondMax>=i){
                    secondMax=secondMax;
                }
                else {
                    secondMax=i;
                }
            }
            if(max>i){
                if(thirdMax>i){
                    thirdMax=thirdMax;
                } else if (i<thirdMax && secondMax>i) {
                    thirdMax=i;
                }
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr ));
    }
}
