import java.util.Arrays;

public class Longest_subarray {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Arrays.sort(A);int sum = 0;
        for(int i = 0; i<N;i++){
            sum+=A[i];
            if(sum==K){
                return i+1;
            }
        }
        return 0;


    }
    public static void main(String[] args) {
        int[] arr = {-13 ,0 ,6 ,15 ,16 ,21,5 ,-12, 17, -16, 0 ,-3, 19, -3, 2 ,-9 ,-6};
        int result = lenOfLongSubarr(arr,arr.length,15);
        System.out.println(result);
    }
}
