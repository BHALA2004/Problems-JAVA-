import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public static List<Integer> result = new ArrayList<>();
    public static List<Integer> pattern(int N){
        // code here
        int temp=N;

        if (N > 0) {
            result.add(N);
            pattern(N - 5);
        }
        result.add(N);

        return result;






    }
    public static void main(String[] args) {

        int n = 4;
        List<Integer> result = pattern(n);
        for(int i = 0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
