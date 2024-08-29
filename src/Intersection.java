import java.util.ArrayList;

public class Intersection {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:a){
            int x = i;
            list.add(x);

        }
        int count  = 0;
        for(int i:b){
            int x = i;
            if(list.contains(x)){
                count++;
            }

        }
        return count;



    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b= {3, 4, 5, 6, 7};
        int result = NumberofElementsInIntersection(a,b,a.length,b.length);
        System.out.println(result);
    }
}
