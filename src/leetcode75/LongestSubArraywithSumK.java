package leetcode75;

public class LongestSubArraywithSumK                    {
    public static int lenOfLongestSubarr(int[] arr, int k) {

        int left=0,right=0;
        int n=arr.length;

        int sum=arr[0],len=0;

        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }

            if(sum==k)len=Math.max(len,right-left+1);
            right++;
            if(right<n){
                sum+=arr[right];
            }

        }

        return len;
    }
    public static void main(String[] args) {
        int[] arr ={1, -1, 5, -2, 3};int k = 3;
        int m =  lenOfLongestSubarr( arr, k);
        System.out.print("    "+m);
    }
}
