import java.util.*;

public class MinimumSumListOfTwoList {
    public static String[] findRestaurant(String[] list1, String[] list2) {

        int x = Integer.MAX_VALUE;
        LinkedHashMap<String,Integer> m1 = new LinkedHashMap<>();
        LinkedHashMap<String ,Integer> m2 = new LinkedHashMap<>();
        for(int i = 0;i<list1.length;i++){
            m1.put(list1[i],i);
        }

        for(int i =0;i<list2.length;i++){
            m2.put(list2[i],i);
        }

        List<String> list = new ArrayList<>();

        int x1 = 0,x2=0,x3=0;
        for(String g : m1.keySet()){
            x1 = m1.get(g);
            if(m2.containsKey(g)){
                x2=m2.get(g);
                x3=x1+x2;
                if(x>x3){
                    list.clear();
                list.add(g);
                x=x3;
                } else if (x==x3) {
                    list.add(g);

                }
            }
        }

        System.out.println(m1);
        System.out.println(m2);

        String[] s = list.toArray(new String[list.size()]);
        return s;






    }
    public static void main(String[] args) {
        String[] strings1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] strings2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] result = findRestaurant(strings1,strings2);
        for(String m : result){
            System.out.println(m);
        }

    }
}
