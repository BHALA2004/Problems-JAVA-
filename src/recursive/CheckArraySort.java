package recursive;

public class CheckArraySort {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,9,8};
        check(ar,0);
    }
    public static void check(int[] arr,int i){
        if(arr[i]>arr[i+1]){
            System.out.println("Unsorted");return;
        }
        if(i== arr.length-2){
            System.out.println("Sorted");
            return ;
        }
        if(arr[i]<arr[i+1]){
            check(arr,i+1);
        }

    }
}
