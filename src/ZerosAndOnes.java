public class ZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0};int m = 0;int count = 0;
        if(arr[0]==0){
             if(arr[1]==0){
                 count++;
             }
        }
        if(arr[arr.length-1]==0){
            if(arr[arr.length-2]==0){
                count++;
            }
        }
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]==0){
                m=i;
                if(arr[i-1]==0 && arr[i+1]==0){
                    count++;
                }

            }

        }
        System.out.println(count);

    }
}
