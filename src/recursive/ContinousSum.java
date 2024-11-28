package recursive;

import java.util.ArrayList;

public class ContinousSum {
    public static void fun(int val,int[] arr,int n , ArrayList<Integer> list , int s) {
        if (val == n) {
            if (s == 2) {
                for (int i : list) {
                    System.out.print(i + " ");


                }
                System.out.println();

            }
            return;
        }
        list.add(arr[val]);
        s += arr[val];
        fun(val + 1, arr, n, list, s);
        list.remove(list.size() - 1);
        s -= arr[val];
        fun(val + 1, arr, n, list, s);
    }
    //-----> for boolean value return

//public static boolean fun(int val,int[] arr,int n , ArrayList<Integer> list , int s){
//    if(val==n){
//        if(s==5){
//            for(int i: list){
//                System.out.print(i+" ");
//
//
//            }
//            System.out.println();return true;
//        }
//        else {
//            return false;
//        }
//    }
//    list.add(arr[val]);
//    s+=arr[val];
//    if(fun(val+1,arr,n,list,s)){
//        return true;
//    }
//    list.remove(list.size()-1);
//    s-=arr[val];
//    if(fun(val+1,arr,n,list,s)){
//        return true;
//    }
//    return false;
//    }

    /// ----> for count subsequence

//    public static int fun(int val,int[] arr,int n , ArrayList<Integer> list , int s){
//        if(val==n){
//            if(s==2){
//                return 1;
//
//
//            }
//           else {
//               return 0;
//            }
//
//        }
//        list.add(arr[val]);
//        s+=arr[val];
//       int l = fun(val+1,arr,n,list,s);
//        list.remove(list.size()-1);
//        s-=arr[val];
//        int r = fun(val+1,arr,n,list,s);
//        return l+r;
//    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        fun(0,arr,arr.length,list,sum);
    }
}
