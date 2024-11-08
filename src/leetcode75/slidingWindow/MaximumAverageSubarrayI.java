package leetcode75.slidingWindow;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;double max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length-k+1;i++){
            int j = i;
            while (j<k+i){
                sum+=nums[j];
                j++;
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return (double)(max/k);
    }
    public static void main(String[] args) {
        int[] nums = {5};int k = 1;
        double result = findMaxAverage(nums,k);
        System.out.println(result);

    }
}
