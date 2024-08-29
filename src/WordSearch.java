import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class WordSearch {
    public static void main(String[] args) {

       char[][] board = {{'a'}};
        String word = "ab";
        Map<Character,Integer> hash = new HashMap<>();
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                hash.put(board[i][j],hash.getOrDefault(board[i][j],0)+1);
            }
        }
       // System.out.println(hash);
        for (int i=0;i<word.length();i++){
           char z = word.charAt(i);
           if(hash.containsKey(z)){
               hash.put(z,hash.get(z)-1);
           }

        }

        if(hash.containsValue(-1)){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }


    }
}
