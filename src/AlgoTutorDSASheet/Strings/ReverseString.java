package AlgoTutorDSASheet.Strings;

public class ReverseString {
    public static String reverseWords(String s) {
        String m = s.trim().replaceAll("\\s+"," ");
        System.out.println(m);
        String s1 = "";
        String[] strings = m.split(" ");
        int left = 0;
        int right = strings.length-1;
        while (left<=right){
            String temp = strings[right];
            strings[right]=strings[left];
            strings[left]=temp;
            left++;
            right--;
        }
        for(int i = 0;i<strings.length;i++){
            s1+=strings[i];
            if(i!=strings.length-1){
                s1+=" ";
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
