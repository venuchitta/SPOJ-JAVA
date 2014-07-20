package javaapplication12;
public class PRIME1_Java {
   public static void main (String[] args) throws java.lang.Exception
  {
     java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
     int cases;
     cases = r.nextInt();
     for (int j=0;j<cases;j++)
     {
       int lowBound = r.nextInt();   //2
       int upperBound = r.nextInt();    //9
       Prime1_filter( lowBound,upperBound+1);
       System.out.println();
     }
  }
   
public static void Prime1_filter(int lowBound,int upperBound) {
      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
      int diff = upperBound-lowBound;             
      boolean[] primes = new boolean[diff + 1];
      java.util.Arrays.fill(primes,true);
      int low_it;
      if (lowBound == 1)
          primes[0]=false;
      for (int m = 2; m <= upperBoundSquareRoot; m++) {
           low_it = lowBound/m;
          if (low_it <2)
              low_it=2;
          for (int n=low_it; m*n<=upperBound;n++){
              if (lowBound <=m*n )
                primes[m*n-lowBound]=false;
          }
          }
      for (int m=0;m<diff;m++)
          if (primes[m]==true)
              System.out.println(m+lowBound);
      }
}
