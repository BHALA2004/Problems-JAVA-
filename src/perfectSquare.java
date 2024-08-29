public class perfectSquare {
    public static boolean perfectsquare(int a){
        boolean f =false;
        for(double i=1;i<a;i++){
            if((i*i)==a){
                f = true;
                break;
            }
        }

        return f;
    }
    public static void main(String[] args) {
        boolean s = perfectsquare(36);
        System.out.println(s);
    }
}
