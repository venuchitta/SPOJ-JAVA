package javaapplication12;
public class Nsteps_class {
  public static void main (String[] args) throws java.lang.Exception
  {
     java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
     int cases;
     cases = r.nextInt();
     for (int j=0;j<cases;j++)
     {
       int ll = r.nextInt();
       int ul = r.nextInt();
       int ans = steps_estimate (ll,ul);
       if (ans ==-1)
           System.out.println("No Number");
       else System.out.println(ans);
     }
  }
    public static int steps_estimate (int i,int j)
    {
        int sum = i+j;
        int q = sum/4;
        int rem = sum %4;
        if (sum%2 == 1)
            return -1;
        else 
        {
          if (i == j)
          {
              if (i%2 ==0)
              return i+j;
              else return i+j-1;
          }
          else if (j+2 == i)
          {
              if (i%2 ==0)
              return i+j;
              else return i+j-1;
          }
        }
        return -1;   
    }
}
