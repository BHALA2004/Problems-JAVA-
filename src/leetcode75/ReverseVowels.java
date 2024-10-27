package leetcode75;

public class ReverseVowels {
    public static String swap(String s, int l, int r) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Swap the characters at indices l and r
        char temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
       String s = "IceCreAm";
       int left = 0;
       int right = s.length()-1;
       while(left<=right){
           if((s.charAt(left)=='a' || s.charAt(left)=='e' ||s.charAt(left)=='i'|| s.charAt(left)=='o' ||s.charAt(left)=='u' ||s.charAt(left)=='A' ||
                   s.charAt(left)=='E' || s.charAt(left)=='I' || s.charAt(left)=='O' || s.charAt(left)=='U') && (s.charAt(right)=='a' || s.charAt(right)=='e' ||s.charAt(right)=='i'|| s.charAt(right)=='o' ||s.charAt(right)=='u' ||s.charAt(right)=='A' ||
                   s.charAt(right)=='E' || s.charAt(right)=='I' || s.charAt(right)=='O' || s.charAt(right)=='U')){
               s=swap(s,left,right);left++;right--;
           } else if (s.charAt(left)=='a' || s.charAt(left)=='e' ||s.charAt(left)=='i'|| s.charAt(left)=='o' ||s.charAt(left)=='u' ||s.charAt(left)=='A' ||
                   s.charAt(left)=='E' || s.charAt(left)=='I' || s.charAt(left)=='O' || s.charAt(left)=='U') {
               right--;
           } else if (s.charAt(right)=='a' || s.charAt(right)=='e' ||s.charAt(right)=='i'|| s.charAt(right)=='o' ||s.charAt(right)=='u' ||s.charAt(right)=='A' ||
                   s.charAt(right)=='E' || s.charAt(right)=='I' || s.charAt(right)=='O' || s.charAt(right)=='U') {
               left++;
           }
           else {
               left++;right--;
           }
       }
        System.out.println(s);
    }
}
