package Hackerrank;

public class Satelite {
    public static String formString(int n){
        String s = "";
        while (n>0){
            s+="SOS";
            n-=3;
        }
        return s;

    }
    public static int marsExploration(String s) {
        // Write your code here
        String str = formString(s.length());
        int index = 0;int count =0;
        while (index<s.length() && index<str.length()){
            if(s.charAt(index)!=str.charAt(index)){
                count++;
            }
            index++;
        }
    return count;

    }
    public static void main(String[] args) {
        String s = "SOSTOT";
        System.out.println(marsExploration(s));
    }
}
