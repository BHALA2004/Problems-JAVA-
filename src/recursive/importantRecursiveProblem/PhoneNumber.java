package recursive.importantRecursiveProblem;

import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        phoneNumber("","8");
        //System.out.println(phoneNumberList("","23"));
    }
    public static void phoneNumber(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);return;
        }
        int n = up.charAt(0)-'0';
        if(n!=7 && n!=9 && n!=8){
        for(int i = (n-1)*3;i< n*3;i++){
            char ch  = (char)('a'+(i-3));
            phoneNumber(p+ch,up.substring(1));
        }}
        else if(n==7){
            for(int i = (n-1)*3;i<= n*3;i++){
                char ch  = (char)('a'+(i-3));
                phoneNumber(p+ch,up.substring(1));
            }
        }
        else if(n==8){
            for(int i = (n-1)*3;i< n*3;i++){
                char ch  = (char)('a'+((i-3)+1));
                phoneNumber(p+ch,up.substring(1));
            }
        }
        else {
            for(int i = (n-1)*3;i<= n*3;i++){
                char ch  = (char)('a'+(i-3)+1);
                phoneNumber(p+ch,up.substring(1));
            }
        }
    }


    public static ArrayList<String> phoneNumberList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);return list;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int n = up.charAt(0)-'0';
        for(int i = (n-1)*3;i<n*3;i++){
            char ch  = (char)('a'+i);
            arrayList.addAll(phoneNumberList(p+ch,up.substring(1)));
        }
        return arrayList;
    }
}
