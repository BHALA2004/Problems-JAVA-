import java.util.ArrayList;
import java.util.List;

public class Right_rotatearrayList {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {



        for(int j = 0;j<k;j++){
        int x = arr.get(0);
         for(int i =0 ;i<arr.size()-1;i++){
             int s = arr.get(i+1);
             arr.set(i,s);
         }
         arr.set(arr.size()-1,x);}

         return arr;




    }
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        //7 5 2 11 2 43 1 1
            s.add(7);
            s.add(5);
            s.add(2);
            s.add(11);
            s.add(2);
            s.add(43);
            s.add(1);
            s.add(1);




        ArrayList<Integer> g = rotateArray(s,2);
        for(int i = 0;i<g.size();i++){
            System.out.println(g.get(i));
        }



    }
}
