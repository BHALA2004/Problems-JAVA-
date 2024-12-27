package recursive.importantRecursiveProblem;

import java.util.ArrayList;

public class PermuatationString {
    static Integer x  = 0;
    public static void main(String[] args) {
        Subset("","abc");
        System.out.println(x);
        System.out.println(subsetPrintArrayList("","abc"));
        System.out.println(subsetPrintArrayListCount("","abc"));
        ArrayList<String> arrayList = new ArrayList<>();
        SubsetPassArgument("","abc",arrayList);
        System.out.println(arrayList);
    }



    public static void Subset(String p,String up){
        if(up.isEmpty()){
            x++;
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            Subset(first+ch+second,up.substring(1));
        }
    }



    public static void SubsetPassArgument(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
           list.add(p);return;
        }

        char ch = up.charAt(0);

        for(int i = 0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            Subset(first+ch+second,up.substring(1));
        }
    }



    public static ArrayList<String> subsetPrintArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(subsetPrintArrayList(first+ch+second,up.substring(1)));
        }
        return ans;
    }




    public static int subsetPrintArrayListCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count+=subsetPrintArrayListCount(first+ch+second,up.substring(1));
        }
        return count;
    }
}
