import java.util.Scanner;

public class Tema4Fibonacci {
    public static int fibonacciRecursive(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }

    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n;
        n = s.nextInt();
        System.out.println("Apel Fibonacci recursiv: ");
        for (int i = 1; i<= n; i++ ) {
            System.out.print(fibonacciRecursive(i)+ " ");
        }
        System.out.println();
        System.out.println("Apel Fibonacci iterativ: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacciIterative(i)+ " ");
        }
    }
}

