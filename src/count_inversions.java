public class count_inversions {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1,};
         int count  = 0;
         for(int i = 0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j] && i<j){
                     count++;
                 }
             }
         }
        System.out.println(count);
    }
}

