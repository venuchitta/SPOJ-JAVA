package javaapplication12;

import java.util.Arrays;

public class Fact_Dyn {
    public static long table[];
  public static void main (String[] args) throws java.lang.Exception
  {
     java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
     int cases = r.nextInt();
     for (int j=0;j<cases;j++)
     {
      int l = r.nextInt();
      table = new long [l+1];
      Arrays.fill(table, 0);
      table[0]=1;
      System.out.println(fact(l));
     }
  }
  public static long fact(int n)
    {
       if(n==0)
         return 1;
       else 
       {
           if (table[n]>0)
               return table[n];
           else
           {
             table[n]=fact(n-1) * n;
             return table[n];
                     }
       }
    }
}
