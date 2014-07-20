package javaapplication12;
public class GIRLSNBS_java {
     public static void main (String[] args) throws java.lang.Exception
  {
     java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
     int girls = r.nextInt();
     int boys = r.nextInt();
     while (girls!= -1){
       System.out.println(min_gender_reg(girls,boys));
       girls = r.nextInt();
       boys = r.nextInt();
       }
  }
     public static int min_gender_reg(int girls,int boys)
     {
       if (girls==0&&boys==0)
           return 0;
       else if (girls==boys)
           return 1;
       else if (girls>boys)
           return (girls+boys)/(boys+1);
       else if (boys>girls)
           return (girls+boys)/(girls+1);
       return 0;
     }
}
