package tcs;

public class Toggle {
    public static void main(String[] args) {
        Integer m = 10;
        String ins = "";
        String s = Integer.toBinaryString(m);
        char[] m1 = s.toCharArray();
        for(char c : m1){
            if(c=='1'){
                ins+=0;
            }
            else {
                ins+=1;
            }
        }
        System.out.println(ins);int count = 0;int sum = 0;
        for(int i = ins.length()-1;i>=0;i--){
            int x = ins.charAt(i)-'0';
            if(x==1){
                sum+= (int)Math.pow(2,count);count++;
            }
            else {
                count++;
                continue;
            }

        }
        System.out.println(sum);


    }
}
