package javaapplication12;
public class CodeJam1 {
    public static int rows=4;
    public static int columns=4;
    public static void main (String[] args) throws java.lang.Exception
    {
        java.util.Scanner r = new java.util.Scanner (new java.io.InputStreamReader (System.in));
        int cases;
        cases = r.nextInt();
        int b;
        for (int a=0;a<cases;a++){
            b=a+1;
            int answer1 = r.nextInt();
            int [][] m1 = new int[rows][columns];
            int [][] m2 = new int[rows][columns];
            for (int i=0;i<rows;i++)
                for (int j=0;j<columns;j++)
                    m1[i][j] = r.nextInt();
            int answer2 = r.nextInt();
            for (int i=0;i<rows;i++)
                for (int j=0;j<columns;j++)
                    m2[i][j] = r.nextInt();
            System.out.println("Case #"+b+": "+result(answer1,m1,answer2,m2));
        }
    }
    public static String result (int a1,int [][]m1,int a2,int[][] m2){
        int []ans1 = new int [rows];
        int []ans2 = new int [rows];
        int count = 0;
        int ans=0;
        for (int i=0;i<rows;i++)
            ans1[i] = m1[a1-1][i];
        for (int i=0;i<rows;i++)
            ans2[i] = m2[a2-1][i];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if (ans1[i] == ans2[j])
                {
                    count++;
                    if (count ==1)
                        ans = ans1[i];
                }
            }
        }
        if (count == 1)
            return Integer.toString(ans);
        else if (count > 1)
            return "Bad magician!";
        else if (count == 0)
            return "Volunteer cheated!";
        return Integer.toString(0);
        
    }
}
