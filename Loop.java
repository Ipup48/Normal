import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("More 0");
        } else {
            System.out.println("Fibonacci num " + n + " is " + fibonacciLoop(n));
        }
        
        sc.close();
    }

    public static int fibonacciLoop(int n) {
        if (n == 1) return 0; 
        if (n == 2) return 1; 
        
        int a = 0, b = 1, sum = 0;
        for (int i = 3; i <= n; i++) { 
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
