import java.util.ArrayList;
import java.util.List;

public class IncDec {
    public static void main(String[] args) {
        int n = 16; int k=2;
        List<Integer> list = new ArrayList<>();
        while (n>=0){
            list.add(n);
            n=n-k;
        }
        list.add(n);
        int x = list.size();
        System.out.println(x);
        for(int i = x-2;i>=0;i--){
            list.add(list.get(i));
        }

        System.out.println(list);

    }
}
