package leetcode75;

public class ReverseStringII {
    public  static  void swap(char[] arr,int i ,int j ){
        int left = i;
        int right = j;
        while(left<=right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }

    }

    public static String reverseStr(String s, int k) {
        String val = "";
        char[] m = s.toCharArray();
        if(s.length()<k){
            swap(m,0,s.length()-1);
        }else {
        swap(m,0,k-1);}
        for(int i = 2*k;i<m.length;i+=2*k){
            try{
            swap(m,i,i+k-1);}
            catch (Exception e){
                swap(m,i,m.length-1);
            }
        }
        for(char g : m){
            val+=g;
        }
        return val;

    }
    public static void main(String[] args) {
        String s = "a";int k = 2;
        String result = reverseStr(s,k);
        System.out.println(result);
    }
}
