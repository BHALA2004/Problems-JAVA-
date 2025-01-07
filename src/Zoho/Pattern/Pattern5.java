package Zoho.Pattern;

import java.util.Arrays;

public class Pattern5 {
    public static void main(String args[])
    {
        String s="welcometozohocorporation";
        Character[][] a=new Character[5][5];// next perfect square to maintain n X n matrix
        int l=-1;
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a[0].length;k++)
            {
                if(l!=s.length()-1)
                    a[i][k]=s.charAt(++l);
                else
                    a[i][k]=' ';
            }
        }
        for(Character[] c : a){
            System.out.println(Arrays.toString(c));
        }
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a[0].length-2;k++)
            {
                int k1=k;
                if(a[i][k]=='t')
                {
                    if(a[i][++k]=='o')
                    {
                        if(a[i][++k]=='o')
                        {
                            System.out.print(i+","+k1+" ");
                            System.out.println(i+","+k);
                        }

                    }
                }

            }
        }
        for(int i=0;i<a[0].length;i++)
        {
            for(int k=0;k<a.length-2;k++)
            {
                int k1=k;
                if(a[k][i]=='t')
                {
                    if(a[++k][i]=='o')
                    {
                        if(a[++k][i]=='o')
                        {
                            System.out.print(k1+","+i+" ");
                            System.out.println(k+","+i);
                        }

                    }
                }
            }
        }
    }
}
