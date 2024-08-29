import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrpPatterns {
    // Method to sort the characters in a string
    public static String sorting(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        // Map to hold the sorted string as key and the list of original strings as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sorting(str);

            // If the key is not already in the map, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            // Add the original string to the list corresponding to the sorted key
            map.get(sortedStr).add(str);
        }

        // Output the grouped anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
        System.out.println(groupedAnagrams);
    }
}
