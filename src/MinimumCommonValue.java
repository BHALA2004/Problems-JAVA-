import java.util.ArrayList;
import java.util.List;

public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        int c = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c=Math.min(c,nums2[j]);
                }

            }
        }
        return c;





    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,6};
        int[] num2 = {1,2,32};
        int result = getCommon(num1,num2);
        System.out.println(result);
    }
}
