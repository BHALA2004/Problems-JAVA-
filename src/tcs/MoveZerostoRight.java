package tcs;

import java.util.Arrays;

public class MoveZerostoRight {
    public static void main(String[] args) {
        int[] array = {6,0,1,8,0,2};int count=0;
        int[] newArray = new int[array.length];int index=0;
        for(int i = 0;i<array.length;i++){
                if(array[i]!=0) {
                newArray[index++]=array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
