package Zoho.Pattern;

public class ProgramPattern {
    public static void main(String args[])
    {
        int temp=6;
        String str="program";
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.print(" ");
                if(i==j&&i!=3)
                    System.out.print(str.charAt(j));
                if(j==temp)
                {
                    System.out.print(str.charAt(j));
                    temp--;
                }
            }
            System.out.println();
        }
    }

}
