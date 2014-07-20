package javaapplication12;
public class lab_exp {
 public static void main (String[] args) throws java.lang.Exception
  {
   java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
     double cases;
     cases = r.nextDouble();
     for (int j=0;j<cases;j++)
     {
      double n = r.nextDouble();
       double k = r.nextDouble();
       double m = r.nextDouble();
       System.out.println(time_exp(n,k,m));
     }
  }
 public static double time_exp (double n,double k ,double m)
 {
    int result=(int) (java.lang.Math.log(m/n)/ java.lang.Math.log(k));
    return result;
 }    
}
