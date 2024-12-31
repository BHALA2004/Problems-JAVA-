package AlgoTutorDSASheet.Arrays;

public class FindLastIndex {
    public static void main(String[] args) {
        int count  = 0;
        String s = "   fly me   to   the moon  ";
        for(int i = s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
            if(s.charAt(i)==' '){
                if(count>0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
