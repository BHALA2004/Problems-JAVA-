public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append( (char)( (columnNumber%26)+'A'));
            columnNumber/=26;

        }
        return sb.reverse().toString();


    }
    public static void main(String[] args) {
        String s = convertToTitle(28);
        System.out.println(s);
    }
}
