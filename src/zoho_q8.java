public class zoho_q8 {
    public static void main(String[] args) {
        String s = "PROGRAM";
        StringBuilder s1  = new StringBuilder(s);
        s1.reverse();
        String m = s1.deleteCharAt(s.length()/2).toString();
        int n = 7;
        int[][] arr = new int[n][n];
        int i=0;
        int j=0;
        int start=0,end=0;
        for(i = 0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j) {
                    System.out.print(s.charAt(start));
                    start++;
                }
                else if(j==n-i-1){
                    System.out.print(m.charAt(end));
                    end++;
                }
                else if(i!=j ){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
