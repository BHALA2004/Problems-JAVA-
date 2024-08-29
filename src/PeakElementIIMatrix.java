import java.util.Arrays;
import java.util.Collections;

public class PeakElementIIMatrix {
    public static void main(String[] args) {
        int m = Integer.MIN_VALUE;
        int[][] arr = {{1,4},{3,2}};
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                m=Math.max(m,arr[i][j]);
            }
        }
        System.out.println(m);
        int[] arr1 = new int[2];
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(m==arr[i][j]){
                arr1[0]=i;arr1[1]=j;}
            }
        }
        for(int i : arr1){
            System.out.println(i);
        }


    }
}
