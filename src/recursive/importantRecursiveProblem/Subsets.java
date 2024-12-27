package recursive.importantRecursiveProblem;

public class Subsets {
    public static void main(String[] args) {
        String up = "abcdf",p="";
        subsetPrint(p,up);
    }
    public static void subsetPrint(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);return;
        }
        subsetPrint(p+up.charAt(0),up.substring(1));
        subsetPrint(p,up.substring(1));
    }
}
