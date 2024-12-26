package recursive;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = {1,2,4,2,6};int target = 5;
        System.out.println(check(ar,target,0));
    }
    public static boolean check(int[] arr,int target,int index){
        if(arr[index]==target){
            return true;
        }
        if(index==arr.length-1){
            return false;
        }
        return check(arr,target,index+1);
    }
}
