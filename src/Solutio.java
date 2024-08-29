import java.util.Arrays;

public class Solutio {

        //Function to check if two arrays are equal or not.
        public static long[] sort(long[] a){

            for(int i=1;i<a.length;i++){
                long key=a[i];int j=i-1;
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=key;
            }

            return  a;

        }

    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        long[] g = sort(A);
        long[] g1 = sort(B);
        String m = Arrays.toString(g);
        String x = Arrays.toString(g1);
        return m.equals(x)?true:false;


    }

    public static void main(String[] args) {
        long[] A = {1,2,5,4,0};
        long[] B = {2,4,5,0,1};
        boolean d = check(A,B,A.length);
        System.out.println(d);
    }
    }

