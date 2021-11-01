package Group2Set6;

public class AllPossible {
    /*
    Given two integers a and b. You need to find and return the count of possible ways in which we can represent the number a as the sum of unique integers raise to the power b.
For example: if a = 10 and b = 2, only way to represent 10 as sum of unique integers raised to power 2 is-
10 = 1^2 + 3^2
Hence, answer is 1.
Note : x^y represents x raise to the power y
Input Format:
The first line of input contains two space separated integers, that denote the value of a and b.
Output Format:
The first and only line of output contains count of ways in which a can be represented as sum of unique integers raised to power b.
Constraints :
1 <= a <= 10^4
1 <= b <= 20
Time Limit: 1 second
Sample Input 1 :
10 2
Sample Output 1 :
1
Sample Input 2 :
100 2
Sample Output 2 :
3
Explanation:
Following are the three ways:
1. 100 = 10^2
2. 100 = 8^2 + 6^2
3. 100 = 7^2+5^2+4^2+3^2+1^2
     */
    static int res = 0;
    static int Possiblity(int num, int x, int k, int n) {
        if (x == 0)
            res++;
        int r = (int)Math.floor(Math.pow(num, 1.0 / n));
        for (int i = k + 1; i <= r; i++) {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
                Possiblity(num, x - (int)Math.pow(i, n), i, n);
        }
        return res;
    }

    // Wrapper over checkRecursive()
    static int check(int x, int n)
    {
        return Possiblity(x, x, 0, n);
    }

    public static void main(String[] args)
    {
        System.out.println(check(100, 2));
    }
}
