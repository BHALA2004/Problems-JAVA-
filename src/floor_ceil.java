public class floor_ceil {
    public static int floor(int[] arr,int n,int x){
        int max=-1;
        for(int i = 0;i<n;i++){
            if(arr[i]<=x){
                max=arr[i];
            }
        }
        return max;
    }
    public static int ceil(int[] arr,int n,int x){
        int max=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=x){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[ ] arr = {1,4,6,8,10}; int x=12;
        int floor = floor(arr,arr.length,x);
        System.out.println(floor);
        int ceil = ceil(arr,arr.length,x);
        System.out.println(ceil);
    }
}
