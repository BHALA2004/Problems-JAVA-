package AlgoTutorDSASheet.Strings;

public class CrossPattern {
    public static void main(String[] args) {
        String s = "zohocorporation";int n = s.length();
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(i==j){
                    System.out.print(s.charAt(i));
                } else if (j==n-i-1) {
                    System.out.print(s.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
