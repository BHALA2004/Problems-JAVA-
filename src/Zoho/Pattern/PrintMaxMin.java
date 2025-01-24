import java.util.Arrays;

public class PrintMaxMin {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,1};
        Arrays.sort(arr);
        int left  = 0;int right = arr.length-1;
        for (int i  = 0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[right--]+" ");
            }
            if(i%2==1){
                System.out.print(arr[left++]+" ");
            }
        }
    }
}
