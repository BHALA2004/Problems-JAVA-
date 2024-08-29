import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();
        int cnt =0;
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(int i : m.keySet()){
            System.out.println(m.get(i));
        }

        System.out.println(m);


    }
}
