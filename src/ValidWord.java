public class ValidWord {
    public static boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowel=0,contsant=0;
        for(int i = 0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                continue;
            }
            else if(word.charAt(i)=='a' || word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'
            ||word.charAt(i)=='A' || word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
                vowel++;
            }
            else if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            else {
                contsant++;
            }

        }
        if(vowel>=1 && contsant>=1){
            return true;
        }
        else {
            return false;
        }



    }
    public static void main(String[] args) {
       String word ="a3$e";
       boolean s = isValid(word);
        System.out.println(s);

    }
}
