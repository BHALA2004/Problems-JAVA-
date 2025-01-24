import java.util.Scanner;

public class MinPermutation {
        public static int countZero(String str){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='0'){
                    count++;
                }
            }
        return count;

        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer Value:");
        int n = scanner.nextInt();
        String str = String.valueOf(n);
        boolean f = true;
        for (char i = '1';i<='9';i++){
            int count  = 0;
            for (int j = 0;j<str.length();j++){
                if (str.charAt(j)==i){
                    count++;
                }
            }
            for (int k = 0;k<count;k++){
                System.out.print(i);
            }
            if(f){
                int counting = countZero(str);
                for (int m = 0;m<counting;m++){
                    System.out.print(0);
                    f=false;
                }

            }

        }
        }
}