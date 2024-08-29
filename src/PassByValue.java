public class PassByValue {

    public static StringBuilder passvalue(StringBuilder s){

        s= new StringBuilder("Maven");
        return s;


    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Suja");
        System.out.println(passvalue(s));
    }
}
