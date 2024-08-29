import java.util.Arrays;

public class PeakElementIMatrix {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};int result = 0;
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        int n = arr[arr.length-1];
        //System.out.println(n);
        for(int i  =0;i<arr1.length;i++){
            if(n==arr1[i]){
                result=i;break;
            }
        }
        System.out.println(result);

    }
}
