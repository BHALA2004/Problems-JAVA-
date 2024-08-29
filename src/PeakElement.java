public class PeakElement {
    public static int peakElement(int[] arr,int n)
    {
        int i = 0;
        int m = 0;int temp = 0;
        //add code here.
        if(n==1){
            return 0;
        }
        if(i==0){
            if(arr[i]>=arr[i+1]){
                m=i;
            }
        }
        for( i = 1;i<n-1;i++){temp=i;
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                m=i;
            }

        }
        if((temp+1)==n-1){
            if(arr[temp+1]>=arr[i-1]){
                m=i;
            }
        }
        return m;

    }
    public static void main(String[] args) {
        int[] arr = {1};
        int n = arr.length;
        int result = peakElement(arr,n);
        System.out.println(result);
    }
}
