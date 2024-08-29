public class ImplementAtoi {
    public static int atoi(String s) {
        int i = 0;int m = -1;
        try{
         m = Integer.parseInt(s);}
        catch (Exception e){

        }
        return m;


    }
    public static void main(String[] args) {
        String s = "21-";
        int m = atoi(s);
        System.out.println(m);
    }
}
