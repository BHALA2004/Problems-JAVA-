public class RowWithMinimumNumberOf1 {
    public  static  int[] rowMin(int[][] a){
        int[] result = new int[2];
        int g = 0;int flag = 0;

        int count=Integer.MIN_VALUE,index=0;
        for(int i=0;i<a.length;i++){
            int cnt=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1)cnt++;
            }
            if(cnt>count){
                count=cnt;
                index=i;
            }
        }
        result[0] = index;
        result[1] = count;
        return result;
    }
    public static void main(String[] args) {

        int[][] a = {{0,0}, {1,1},{0,0}};
        int[] result = rowMin(a);
        for(int i : result){
            System.out.println(i);
        }


    }
}
