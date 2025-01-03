package Zoho.Pattern;

public class Anagram {
    public static void main(String[] args) {
        String a = "listeni";
        String b = "silent";

        int n = a.length();
        int[] arr = new int[n];
        if(a.length()!=b.length()){
            System.out.println("Not Anagram");System.exit(1);
        }

        for(int i = 0;i<n;i++){
            int index = a.indexOf(a.charAt(i));
            arr[index]+=1;
        }

        for(int i = 0;i<n;i++){
            int index = a.indexOf(b.charAt(i));
            if(index==-1){
                System.out.println("Not Anagram");System.exit(1);
            }
            arr[index]-=1;
        }

        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                System.out.println("Not Anagram");break;
            }
        }
        System.out.println("Anagram");

    }
}
