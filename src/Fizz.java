import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizz {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        int[] arr = {0,2,41,5,4,3,8};
        int[] m = Arrays.copyOfRange(arr,0,3);
        System.out.println(Arrays.toString(m));
        int n=15;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
               l.add("FizzBuzz");
            }
            else if(i%3==0){
                l.add("Fizz");
            } else if (i%5==0) {
                l.add("Buzz");

            }
            else {
                l.add(Integer.toString(i));
            }
        }
        //System.out.println(l);
    }
}
