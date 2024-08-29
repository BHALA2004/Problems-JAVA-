public class count_character {
    public static int[] count(String str){
        int[] sum = new int[4];
        int upper = 0;
        int lower = 0;
        int special = 0;
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                upper++;
        } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                special++;}
        }
        sum[0]=upper;
        sum[1]=lower;
        sum[2]=digits;
        sum[3]=special;
        return sum;
    }
    public static void main(String[] args) {
        String s =  "*GeEkS4GeEkS*";
        int[] sum =count(s);
        for(int i =0;i<4;i++){
            System.out.println(sum[i]);
        }

    }
}
