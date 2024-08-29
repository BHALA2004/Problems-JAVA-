import java.util.ArrayList;
import java.util.List;

class Merge_Sort {
    public static void merge(int arr[], int l, int m, int r) {
        // Temporary list to store the merged array
        List<Integer> list = new ArrayList<>();

        int left = l;
        int right = m + 1;

        // Merge the two subarrays
        while (left <= m && right <= r) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
  // Copy the remaining elements of the left subarray
        while (left <= m) {
            list.add(arr[left]);
            left++;
        }
     // Copy the remaining elements of the right subarray
        while (right <= r) {
            list.add(arr[right]);
            right++;
        }
 // Copy the merged elements back into the original array
        for (int i = 0; i < list.size(); i++) {

            //at right merging the element is printed again soo from given left it willl print
            arr[ l+i] = list.get(i);
        }
    }

    public  static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            // Sort the first and second halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    // Main method to test the merge sort
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
