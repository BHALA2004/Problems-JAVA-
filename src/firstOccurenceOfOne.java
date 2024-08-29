public class firstOccurenceOfOne {
    public static long firstOne(int[] arr)
    {
        
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        int result = 0;
        if(arr[0]==1){
            result=0;
        } else {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==1){
                temp=mid-1;
                if(arr[temp]==0){
                    result=mid;
                    break;
                }
                end=mid-1;


            } else if (arr[mid]==0) {
               start=mid+1;

            }
        }}
        return result;

    }
    public static void main(String[] args) {
            int[] arr = {};
            long result  = firstOne(arr);
        System.out.println(result);
    }
}
