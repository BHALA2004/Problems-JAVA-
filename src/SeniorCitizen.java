public class SeniorCitizen {
    public static void main(String[] args) {
        String[] strings = {"7868190130M7522","5303914400F9211","9273338290F4010"};int count = 0;
        for(int i = 0;i<strings.length;i++){
            String g = strings[i];
            String m = g.substring(11,13);

            int c = Integer.parseInt(m);
            if(c>60){
                count++;
            }

        }

        System.out.println(count);

    }
}
