public class repeating {
    public static void main(String[] args) {

        int[] a ={0 ,1 ,0};
        int[] b = new int[a.length];
        int c=0,c1=0,c2=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c++;
            } else if (a[i]==1) {
                c1++;

            } else {
                c2++;

            }
        }

        System.out.println(c +" "+c1+" " + c2);
        for(int i=0;i<c;i++){
            b[i]=0;
        }
        for(int i=c;i<c1+c;i++){
            b[i]=1;
        }
        for(int i=c1+c;i<c2+c1+c;i++){
            b[i]=2;
        }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
