import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKthRotation {
    public static int findKRotation(List<Integer> arr) {
        // Code here

        Integer[] m = arr.toArray(new Integer[arr.size()]);
        int result = 0;
        Arrays.sort(m);
        int k = m[0];
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)==k){
                result=i;break;
            }
        }
        return result;


    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        int result = findKRotation(list);
        System.out.println(result);

    }
}
