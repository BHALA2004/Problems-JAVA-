import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class change_check_range_integer {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(i);
        }
        for(int i=0;i< ranges.length;i++){
            for(int j=0;j<ranges[0].length;j++){
                Integer initial = ranges[i][j];
                list2.add(initial);
            }}
        return list.contains(list2)?true:false;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,1}};
        int l = 1,r = 50;
        boolean result =isCovered(arr,l,r);
        System.out.println(result);
    }

}
