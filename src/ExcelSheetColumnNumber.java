public class ExcelSheetColumnNumber {
    public static int findNumberByDigit(String s){
        int sum=0;
        int n = s.length()-1;
        for(int i = 0;i<s.length();i++){
            if((i!=n)){
            sum=(sum+s.charAt(i)-'A'+1)*26;}
            else {
                sum=sum+(s.charAt(i)-'A'+1);
            }

        }
        return sum;


    }
    public static void main(String[] args) {
        String s = "AAC";
        int result = findNumberByDigit(s);
        System.out.println(result);


    }
}
