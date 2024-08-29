public class new_one {
    public static void main(String[] args) {
        int s = 3;
        for(int i = 1;i<=3;i++){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=s-i+1;j>0;j--){

                System.out.print(" *");
            }
            System.out.println();
        }
        String g ="";
        for(char x = 'A';x<'A'+3;x++){
            g+=x;
        }
        System.out.println(g);

    }
}
