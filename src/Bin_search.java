public class Bin_search {
    public static void main(String[] args) {
        int arr[]={4,3,1,7};
        int s = 7;
        int g=0;
        int st=0,sp=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=(st+sp)/2;
            if(arr[mid]==s){
                g=1;
                break;
            }
            else if(s>arr[mid]){
                st=mid+1;
            } else if (s<arr[mid]) {
                sp=mid-1;

            }
        }
        if(g==1)
            System.out.println("found");
        else
            System.out.println("nf");
    }
}
