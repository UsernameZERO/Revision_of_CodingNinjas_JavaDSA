package Lecture6_Patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {
    /*
    Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555
4444
333
22
1
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();
        int i=1;
        int j=N;
        while (i<=N){
            int k=1;
            while (k<=j){
                System.out.print(j);
                k++;
            }
            System.out.println();
            j--;
            i++;
        }
    }
}
