package Zoho.Pattern;

public class AlphabetPattern {
    public static void main(String[] args) {
        for(char i = 'A';i<='E';i++){
            for(char j = 'A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for(char i = 'A';i<='E';i++){
            for(char j = 'A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
