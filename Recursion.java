import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("More 0");
        } else {
            System.out.println("Fibonacci num " + n + " is " + fibonacciRecursion(n - 1));
        }
        
        sc.close();
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) return 0; // ตัวแรกของ Fibonacci คือ 0
        if (n == 1) return 1; // ตัวที่สองของ Fibonacci คือ 1
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}