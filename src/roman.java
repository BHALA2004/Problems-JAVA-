class roman {
    public static int check(char r){
        int main=0;
        if(r=='I')
            main= 1;
        else if(r=='V')
            main = 5;
        else if(r=='X')
            main = 10;
        else if(r=='L')
            main = 50;
        else if(r=='C')
            main = 100;
        else if(r=='D')
            main = 500;
        else if(r=='M')
            main = 1000;
        return main;
    }
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        int sum=0;
        int r = c.length;
        int i=0,j=i+1;
        while(i<r && j<r){
            if(check(c[i])>check(c[j])){
                sum+=check(c[i]);i++;j++;
            }
            else if (check(c[i])<check(c[j])){
                int sum1=check(c[j])-check(c[i]);
                sum+=sum1;i++;j++;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int m = romanToInt("I");
        System.out.println(m);
    }

}