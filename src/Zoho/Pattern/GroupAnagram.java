import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] anagram = {"abc","cba","ab"};
        Map<String, List<String>> map = new HashMap<>();
        for (String string : anagram){
            char[] oldarr = string.toCharArray();
            Arrays.sort(oldarr);
            String s  = "";
            for (char c : oldarr){
                s+=c;
            }
            if(!map.containsKey(s)){
                List<String> newone = new ArrayList<>();
                newone.add(string);
                map.put(s,newone);
            }
            else{
                List<String> list = map.get(s);
                list.add(string);
                map.put(s,list);
            }

        }
        System.out.println(map);
    }
}
