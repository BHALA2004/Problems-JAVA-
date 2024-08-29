import java.util.Arrays;

public class triplet_with_zero_sum {
    public static boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            // Fix the first element
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;

    }
    public static void main (String[] args){
        int n = 6, arr[] = {97 ,-27, 2, -34 ,61 ,-39};
        boolean s = findTriplets(arr,n);
        System.out.println(s);
    }

}
