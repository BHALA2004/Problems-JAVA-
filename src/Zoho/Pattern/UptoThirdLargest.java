package Zoho.Pattern;

public class UptoThirdLargest {
    public static void main(String[] args) {
        int[] arr = {6,11,4,8,12,2,9,10,13,0};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i){
                thirdMax=secondMax;
                secondMax=max;
                max=i;
            }
            if(max>i){
                if(secondMax>i){
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
    }
}
