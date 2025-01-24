import java.util.Scanner;

public class OddOccurences {
    public static int CalculateCount(int[] arr,int element){
        int count = 0;
        for (int i : arr){
            if(i==element){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements");
        for (int i = 0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        boolean check = false;
        for (int i : arr){
            int count = CalculateCount(arr,i);
            if(count%2==1){
                System.out.print(i+" ");
                check=true;
            }
        }
        if(!check){
            System.out.println("No odd occuring Elements");
        }

    }
}
