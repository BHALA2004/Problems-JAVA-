public class zoho_q4_1 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;end--;
        }
        for(char i : s){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
    }
}
