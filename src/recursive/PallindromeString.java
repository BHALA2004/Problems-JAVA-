package recursive;

public class PallindromeString {
    public static boolean fun(char[] arr,int i){
        if(i>=arr.length/2){
            return true;
        }
        if(arr[i]!=arr[arr.length-1-i]){
            return false;
        }
        return fun(arr,i+1);
    }
    public static void main(String[] args) {
        String res = "BALA";
        char[] val = res.toCharArray();
        System.out.println( fun(val,0));
    }
}
