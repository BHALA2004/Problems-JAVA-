package Zoho.Pattern;

public class LongestSubArraybyKsum {
    public static void main(String[] args) {
        int a[] = {-1, 2, -3};int k = -2;
        int right = 0 ;int left = 0;int sum = 0;int max=0;
        int n = a.length;
        while(right<n){
            sum+=a[right];
            right++;
            while(sum>k && left<n){
                sum-=a[left];left++;
            }
            if(sum==k){
                max=Math.max(max,right-left);
            }
        }
        System.out.println(max);
    }
}
