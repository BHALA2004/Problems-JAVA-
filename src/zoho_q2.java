import java.util.ArrayList;

public class zoho_q2 {
    public static short check(int m , int[] arr,int inc){
        int flag=1;
        int max=0;
        for(int i=inc+1;i< arr.length;i++){
            if(flag==1 && m<arr[i]){
                max=arr[i];flag=0;
            } else if (m<arr[i] && max>arr[i]) {
                max=arr[i];

            }

        }
        if(max==0){
            return -1;
        }
        else {
            return (short) max;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = { 2,-1,0,-1,3};
        for(int i = 0;i<arr.length;i++){
            int temp=check(arr[i],arr,i);
            list.add(temp);

        }
        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
