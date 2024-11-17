package Recursion;

public class Q1Basic_Recursion {
        public static void main(String[] args) {
                int n = 5;
                // printName(1, n);
                // printNum1ton(1, n);
                printNumnto1(n);
        }

        public static void printName(int i, int n) {
                if (i == n + 1)
                        return;
                System.out.println("Siddhesh");
                printName(i + 1, n);
        }

        public static void printNum1ton(int i, int n) {
                if (i == n + 1)
                        return;
                System.out.println(i);
                printNum1ton(i + 1, n);
        }

        public static void printNumnto1(int i) {
                if (i == 0)
                        return;
                System.out.println(i);
                printNumnto1(i - 1);
        }
}
