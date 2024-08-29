public class BinaryMatrixMax1 {
    public static int ceilof1(int mat[],int n){

        int left = 0;
        int right = n-1;int result = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if(mat[mid]==1){
                result=mid;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return result;

    }
    public static int[] findMaxRow(int mat[][], int N) {
        // code here
        int result = 0;
        int index=0;
        for(int i = 0;i<N;i++){
            if(ceilof1(mat[i], mat[i].length)!=-1){
            int count  =mat[0].length- ceilof1(mat[i], mat[i].length);
                if(result<count){
                    result=count;
                    index=i;
                }}

        }
        return new int[]{index, result};



    }

    public static void main(String[] args) {
        int N=3;
        int mat[][] = {{0, 0, 1,},
                {0, 1, 1,},
                { 0, 0, 0}};
        int[] result = findMaxRow(mat,N);
        for(int i:result){
            System.out.println(i);
        }
    }
}
