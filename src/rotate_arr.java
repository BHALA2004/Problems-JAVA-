public class rotate_arr {
    public static void rotate(int[] arrs){
        int n = arrs.length;
        for(int j=0;j<2;j++){
        int temp = arrs[n - 1];
        for(int i = n - 1; i > 0; i--){
            arrs[i] = arrs[i - 1];
        }
        arrs[0] = temp;}
        for(int x : arrs){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr);
    }
}