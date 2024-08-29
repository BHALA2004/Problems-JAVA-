import java.util.ArrayList;
import java.util.Arrays;

public class First_missing {
    public static void main(String[] args) {
        int[] arr={2};
         Arrays.sort(arr);

         //System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arr_list= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            arr_list.add(arr[i]);
        }
        for(int i=1;i<arr.length;i++){
            if(!arr_list.contains(i)){
                System.out.print(i);
                break;
            }
        }
        for(int num : arr_list){
            if(arr_list.contains(num)){

            }
        }

    }
}
