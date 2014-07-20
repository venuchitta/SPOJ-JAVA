package javaapplication12;
import java.util.Scanner;

// In this program dynamic programming is used to find number of different ways to represent any arbitrary
// value using any number of or combination of denominations(1, 5, 10, 25,100,500,1000,2000,5000,10000)
// The input is taken from keyboard and the input should be given in dollars. A dynamic table is generated
// via dynamic programming.
public class TPC07_SPOJ_JAVA {
    // The main function which displays number of different ways to represent value that was taken from keyboard
    public static void main(String[] args) {
        int [] den_cents ={1, 5, 10, 25,100,500,1000,2000,5000,10000}; // The denominations in cents
        System.out.println("Enter the value(in $): ");
        Scanner scanner= new Scanner(System.in);
        double d_value = scanner.nextDouble();
        int value = (int)(d_value*100);
        System.out.println("Number of different ways: "+makeChangedyn(value,den_cents));     // The result is displayed
    }

    // The function that computes the number of different ways via table from dynamic programming.
    public static int makeChangedyn(int value,int [] den_cents) {
        int no_den = den_cents.length;      // Number of denominations
        if (value < 0)
            return 0;
        else if ((value>=0) && (value < 5))
            return 1;
            // Build table here.
        else {
            int[][] dyn_table = new int[no_den][value+1];

            // Table initialization.
            for (int i=0; i<value+1;i++)
                dyn_table[0][i] = 1;

            for (int i=0; i<5; i++)
                for (int j=0;j<no_den;j++)
                    dyn_table[j][i] = 1;

            // Fill in table, row by row.
            for (int i=1; i<no_den; i++) {
                for (int j=5; j<value+1; j++) {
                    for (int k=0; k<=i; k++) {
                        if ( j >= den_cents[k])
                            dyn_table[i][j] += dyn_table[k][j - den_cents[k]];
                    }
                }
            }
            return dyn_table[no_den-1][value];
        }
    }
    
}
