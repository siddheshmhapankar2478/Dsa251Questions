package Recursion;

public class Q2_Basic_Recursion2 {
    public static void main(String[] args) {
        int n = 6;
        int ans = sumOfN(1, n);
        int factorial = factorialOfN(n);
        int fibonacci = fibonacciOfN(n);
        System.out.println("Sum of " + n + " natural number = " + ans);
        System.out.println("Factorial of " + n + " natural number = " + factorial);
        System.out.println("fibonacci of " + n + " natural number = " + fibonacci);
    }

    public static int sumOfN(int i, int n) {
        if (i > n)
            return 0;
        return i + sumOfN(i + 1, n);
    }

    public static int factorialOfN(int n) {
        if (n == 1)
            return 1;
        return n * factorialOfN(n - 1);
    }

    public static int fibonacciOfN(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacciOfN(n - 1) + fibonacciOfN(n - 2);
    }
}
