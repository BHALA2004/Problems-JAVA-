package Zoho.Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 11;int mid = n/2+1;int temp = 1;
        for (int i = 1; i <= mid ; i++) {
            int hold = temp;
            for (int j = 1; j <=i ; j++) {
                System.out.print(temp+"     ");
                temp--;
            }
            temp=hold+i+1;
            System.out.println();
        }
        temp=temp-(mid+1);
        mid--;
        temp=temp+mid;
        for (int i = mid; i >=1 ; i--) {
            int hold = temp;
            for (int j = i; j >= 1; j--) {
                System.out.print(temp+"    ");
                temp--;
            }
            mid--;
            temp=hold+mid;
            System.out.println();
        }
    }
}
