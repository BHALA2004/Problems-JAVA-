public class newing_one {
    public static void main(String[] args) {
        int n = 5,space=2*(n-1);
        for(int i = 1;i<=n;i++){
            for(int star = 1;star<=i;star++){
                System.out.print("*");
            }
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int star = 1;star<=i;star++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();

        }
    }
}
