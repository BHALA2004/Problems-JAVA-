import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class abc {
    public static void main(String[] args){
        String str = "i love india";
 Pattern pattern = Pattern.compile("[^\\s]+");
        Matcher matcher = pattern.matcher(str);
        String largestWord = "";
  while (matcher.find()) {
            String currentWord = matcher.group();

            if (currentWord.length() > largestWord.length()) {
                largestWord = currentWord;
            }
        }
System.out.println( largestWord);
    }
}
