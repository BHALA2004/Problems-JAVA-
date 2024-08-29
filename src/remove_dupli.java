import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_dupli {
    public static int[] duplicates(int[] arr){
        int k=0;

        List<Integer> array = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(!array.contains(arr[i])){
                array.add(arr[i]);k++;
            }
            else if(array.contains(arr[i])){
                continue;
            }
        }

        //System.out.println(k);

        for(int i=0;i<k;i++){
            arr[i]=array.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(arr);

       int[] mass=duplicates(arr);
       for(int i : mass){
           System.out.println(i);
       }

    }
}
