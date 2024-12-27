package recursive.importantRecursiveProblem;

import java.util.ArrayList;

public class SubsetsPlusAscii {
    public static void main(String[] args) {
        String up = "abc",p="";//subsetPrint(p,up);
        System.out.println(subsetPrintArrayList(p,up));
    }
    public static void subsetPrint(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);return;
        }
        subsetPrint(p+up.charAt(0),up.substring(1));
        subsetPrint(p+(int)up.charAt(0),up.substring(1));
        subsetPrint(p,up.substring(1));
    }


    public static ArrayList<String> subsetPrintArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String > arrayList = new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
        ArrayList<String> first = subsetPrintArrayList(p+up.charAt(0),up.substring(1));
        ArrayList<String> second = subsetPrintArrayList(p+(int)up.charAt(0),up.substring(1));
        ArrayList<String> third  = subsetPrintArrayList(p,up.substring(1));
        first.addAll(second);first.addAll(third);return first;
    }
}
