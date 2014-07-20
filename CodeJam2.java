package javaapplication12;

import java.text.DecimalFormat;

public class CodeJam2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
        int cases;
        cases = r.nextInt();
        for (int a=0;a<cases;a++){
            int b = a+1;
            double c = r.nextDouble();
            double f = r.nextDouble();
            double x = r.nextDouble();
            DecimalFormat four = new DecimalFormat("#0.0000000");
            System.out.println("Case #"+b+": "+four.format(cal_time(c,f,x)));
        }
    }
    
    public static double cal_time(double c, double f, double x)
    {
        int it =(int) ((int) x/c);
        double num = c;
        double den = 2.0;
        double time = 0;
        for (int i = 0;i<it-1;i++)
        {
            time += num/den;
            den += f;
        }
        time+=x/(den);
        return time;
    }
}
