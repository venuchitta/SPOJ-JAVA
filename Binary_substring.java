package javaapplication12;
public class Binary_substring {
 public static void main (String[] args) throws java.lang.Exception
  {
      java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
      String s;
      int number = 2;
      for (int i=0;i<number;i++)
      {
      s=r.readLine(); 
      String[] split1 = s.split(" ");
      if (binaryString(split1[0],split1[1]))
          System.out.println(1);
      else System.out.println(0);
      }
      
  }
 public static boolean binaryString (String st1,String st2)
 {
    int length1 = st1.length();
    int length2 = st2.length();
    int index1 = 0;
    while (index1<length1-length2+1)
    {
      String st = st1.substring(index1,index1+length2);
      System.out.println(st);
      if (st.equals(st2))
          return true;
      index1++;
    }
     return false;
 }
}
