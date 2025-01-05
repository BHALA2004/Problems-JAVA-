package AlgoTutorDSASheet.Arrays;
import java.util.*;
public class sorting {
    public static void main(String args[])
    {
        int arr[]= {2,2,2,2,3,3,3,1,1,0};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!m.containsKey(arr[i]))
                m.put(arr[i],1);
            else
                m.put(arr[i], m.get(arr[i])+1);
        }
        List<List<Integer>> l=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(entry.getValue());
            row.add(entry.getKey());

            l.add(row);
        }

        Collections.sort(l,(b,a)->a.get(0).compareTo(b.get(0)));
        for(List<Integer> list : l){
            System.out.println(list);
        }
    }
}
