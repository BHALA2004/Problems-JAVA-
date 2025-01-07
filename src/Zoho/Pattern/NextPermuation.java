package Zoho.Pattern;

public class NextPermuation {
    public static void reverse(int[] arr,int left,int right){
        while (left<=right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
    }
    public static void swap(int[] arr ,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
       int[] arr = {2,3,1};
       int index1 = -1;
       int index2= -1;
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]<arr[i+1]){
               index1=i;
               break;
           }
       }
       if(index1==-1){
           reverse(arr,0,arr.length-1);
       }
       else {
           for(int i = arr.length-1;i>=0;i--){
               if(arr[i]>arr[index1]){
                   index2=i;
                   break;
               }
           }
           swap(arr,index1,index2);
           reverse(arr,index1+1, arr.length-1);
       }
       for(int i : arr){
           System.out.println(i);
       }
    }
}
