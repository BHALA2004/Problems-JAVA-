package recursive;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] ar = {3,4,1,2};int target = 11;
        System.out.println(search(ar,target,0,ar.length-1));
    }
    public static boolean search(int[] arr,int target,int s,int e){
        if(s>e){
            return false;
        }
        int mid  = s+(e-s)/2;
        if(arr[mid]==target){
            return true;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return  search(arr,target,s,mid-1);
            }
            else {
                return  search(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return search(arr,target,mid+1,e);
        }
        return search(arr,target,s,mid-1);
    }
}
