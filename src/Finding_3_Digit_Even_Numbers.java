import java.util.*;

public class Finding_3_Digit_Even_Numbers {
    public static int[] findEvenNumbers(int[] digits) {
        Set<String> list = new TreeSet<>();


        for(int i = 0;i<digits.length;i++){
            for(int j = 0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && i!=k && j!=k){

                    String m = Integer.toString(digits[i])+Integer.toString(digits[j])+Integer.toString(digits[k]);
                    int c = Integer.parseInt(m);

                    if(c>99 && c%2==0){

                    list.add(m);}}
                }
            }
        }
        int[] result = new int[list.size()];int count = 0;

        for (String s : list){
            result[count]= Integer.parseInt(s);count++;
        }






        return result;



    }
    public static void main(String[] args) {
       int[] digits = {2,0,8,5,7,0,6,3,2,1,0,5,7,0,2,4,6,0,5,7,1,4,1,3,9,1,3,6,6,5,9,8,5,5,3,9,3,8,6,3,1,6,2,1,6,4,9,7,9,3,2,8,7,5,6,8,4,5,6,9,2,5,9,8,0,4,5,7,1,9,4,7,0,0,8,7,2,2,7,6,4,4,3,1,0,9,8,3,1,2,8,2,8,4,3,7,0,4,9,1};
       int[] g = findEvenNumbers(digits);
        System.out.println(Arrays.toString(g));


    }
}
