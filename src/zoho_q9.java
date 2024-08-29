import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zoho_q9 {
    public static boolean perfectsquare(int a){
        for(int i=1;i<a/2;i++){
            if((i*i)==a){
                return true;
            }
        }

        return false;
    }
    public static boolean multiple(int a){
        if(a%4==0 && a%6==0){
            return true;
        }
        return false;
    }
    public static boolean even(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int count = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        arr=new int[]{10,36,54,89,12};
        for(int i=0;i<arr.length;i++){
            if(perfectsquare(arr[i])){
                count +=5;
            }
            if(multiple(arr[i])){
                count+=4;
            }
            if(even(arr[i])){
                count+=3;
            }
            hash.put(arr[i],count);
            count=0;
        }

        System.out.println(hash);

    }
}
