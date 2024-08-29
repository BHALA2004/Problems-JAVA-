//import java.util.HashMap;
//import java.util.Stack;
//
//public class zoho_q10 {
//    public static void main(String[] args) {
//        String s ="WELCOMETOZOHOCORPORATION";
//        int c=0;
//        String[][] s2 = new String[5][5];
//        int row = 5;
//        int col = 5;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                // Check if we have reached the end of the string
//                if (c < s.length()) {
//                    s2[i][j] = String.valueOf(s.charAt(c));
//                    c++;
//                } else {
//                    s2[i][j] = ""; // Assign empty string if we run out of characters
//                }
//            }
//        }
//
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                System.out.print(s2[i][j]+" ");
//            }
//            System.out.println();
//        }
//        String s3 = "TOO";
//        int rows =s2.length;
//        int cols=s2[0].length;
//        int subLength = s3.length();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j <= cols - subLength; j++) {
//                if (s2[i][j].equals(s3.charAt(0)) && s2[i][j+1].equals(s3.charAt(1)) && s2[i][j+2].equals(s3.charAt(2))) {
//                    System.out.println("Start index: <" + i + "," + j + ">");
//                    System.out.println("End index: <" + i + "," + (j + 2) + ">");
//
//                }
//            }
//        }
//
//        // Search vertically
//        for (int j = 0; j < cols; j++) {
//            for (int i = 0; i <= rows - subLength; i++) {
//                if (s2[i][j].equals(s3.charAt(0)) && s2[i+1][j].equals(s3.charAt(1)) && s2[i+2][j].equals(s3.charAt(2))) {
//                    System.out.println("Start index: <" + i + "," + j + ">");
//                    System.out.println("End index: <" + (i + 2) + "," + j + ">");
//
//                }
//            }
//        }
//
//
//
//
//
//    }
//}
public class zoho_q10 {
    public static void main(String[] args) {
        char[][] arr = {
                {'w', 'e', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'O'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'n', ' '}
        };

        String substring = "too";
        findSubstring(arr, substring);

        int x = 10;

    }

    public static void findSubstring(char[][] arr, String substring) {
        int rows = arr.length;
        int cols = arr[0].length;
        int subLength = substring.length();

        // Search horizontally
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - subLength; j++) {
                if (arr[i][j] == substring.charAt(0) && arr[i][j+1] == substring.charAt(1) && arr[i][j+2] == substring.charAt(2)) {
                    System.out.println("Start index: <" + i + "," + j + ">");
                    System.out.println("End index: <" + i + "," + (j + 2) + ">");
                    return;
                }
            }
        }

        // Search vertically
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i <= rows - subLength; i++) {
                if (arr[i][j] == substring.charAt(0) && arr[i+1][j] == substring.charAt(1) && arr[i+2][j] == substring.charAt(2)) {
                    System.out.println("Start index: <" + i + "," + j + ">");
                    System.out.println("End index: <" + (i + 2) + "," + j + ">");
                    return;
                }
            }
        }

        System.out.println("Substring not found");
    }
}

