import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inserting {
    public static void main(String[] args) {
        int[] arr = {-1,2,4,9};int[] num = new int[2];int x =0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int k =0;int g = 0;
        for(int i = 0;i<arr.length;i++){
            if(k>arr[i]){
                list.add(arr[i]);
            }
        }
        int m = list.getLast();
        for(int i = 0;i<arr.length-1;i++){
            if(m==arr[i]){
                x=arr[i+1];
            }
        }
        num[0]=list.getLast();
        num[1]=x;
        for(int i:num){
            System.out.println(i);
        }
        System.out.println(list);

    }
}
