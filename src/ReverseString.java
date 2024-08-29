import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vinayak");
        list.add("Danush");
//        list.add("Bala");
//        list.add("Danush");
//        list.add("Bala");
//        list.add("Danush");
        System.out.println(list);
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<list.size();i++) {
            hashMap.put(list.get(i),hashMap.getOrDefault(list.get(i),0)+1);
        }
        System.out.println(hashMap); String g = "";int m1 = 0;
        for(String s : hashMap.keySet()){
            g = s;
            if(hashMap.get(s)>1){
                m1 = hashMap.get(s);
                for(int i = 0;i<m1;i++){
                    list.remove(g);
                }
        }

        }


        System.out.println(list);

    }
}
