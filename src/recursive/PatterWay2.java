package recursive;

public class PatterWay2 {
    public static void main(String[] args) {
        Triangle2(4,0);
    }
    public static void Triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            Triangle(r,c+1);
        }else {
        System.out.println();
        Triangle(r-1,0);}
    }
    public static void Triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Triangle2(r,c+1);
            System.out.print("* ");
        }else {
            Triangle2(r-1,0);
            System.out.println();}
    }
}
