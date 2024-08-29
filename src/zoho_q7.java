public class zoho_q7 {
    public static int hammingWeight(int n) {
        StringBuilder s = new StringBuilder();int r=0;
        while(n>0){
             r = n%2;
            s.append(r);
            n/=2;
        }
        int count=0;
        String g = s.reverse().toString();
        for(int i=0;i<g.length();i++){
            char m = g.charAt(i);
            if(m=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int g = hammingWeight(2147483645);
        System.out.println(g);
        int[] nums = {1,2,3};
    }
}
