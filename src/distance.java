public class distance {
    public static int distance(int x1,int y1,int x2,int y2){
        int m =(x2-x1)*(x2-x1);
        int n =(y2-y1)*(y2-y1);
        int k =m+n;
        double c = Math.sqrt((double) k);
        double r = Math.round(c);
        int s = (int)r;
        return s;

    }
    public static void main(String[] args) {
        int r = distance(-20 ,23 ,-15, 68);
        System.out.println(r);
    }
}
