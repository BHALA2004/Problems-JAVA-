package Zoho.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CutRopes {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int arr[] = {5, 1, 6, 9, 8, 11, 2, 2, 6, 5};
        Arrays.sort(arr);
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]-min>0){
                list.add(arr.length-i);
                min=arr[i];
            }

        }
        System.out.println(list);
    }
}
