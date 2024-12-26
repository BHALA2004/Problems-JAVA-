package recursive;

public class Pattern {
    public static void print(char c,int j){
        if(j==0){
            return;
        }
        System.out.print(c+" ");print(c,j-1);
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i = n;i>=1;i--){
            print('*',i);System.out.println();
        }

    }
}
