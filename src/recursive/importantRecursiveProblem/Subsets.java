package recursive.importantRecursiveProblem;

import java.util.ArrayList;

public class Subsets {

    public static void main(String[] args) {
        String up = "abcdf",p="";ArrayList<String> s = new ArrayList<>();
        subsetPrint(p,up);
        System.out.println(subsetPrintArrayList("","abc"));
        subsetPrintArrayListPassArgument("","abc",s);
        System.out.println(s);
    }

//Print values
    public static void subsetPrint(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);return;
        }
        subsetPrint(p+up.charAt(0),up.substring(1));
        subsetPrint(p,up.substring(1));
    }


//Return List without Passing Argumens
    public static ArrayList<String> subsetPrintArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subsetPrintArrayList(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = subsetPrintArrayList(p,up.substring(1));
        left.addAll(right);
        return left;
    }


    //Without Return Passing Arguments
    public static void subsetPrintArrayListPassArgument(String p, String up,ArrayList<String> arrayList){
        if(up.isEmpty()){
            arrayList.add(p);
            return ;
        }
         subsetPrintArrayListPassArgument(p+up.charAt(0),up.substring(1),arrayList);
         subsetPrintArrayListPassArgument(p,up.substring(1),arrayList);

    }
}
