import java.util.Scanner;

public class NumMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 : ");
        int num1 = sc.nextInt();
        System.out.print("num2 : ");
        int num2 = sc.nextInt();
        System.out.print("num3 : ");
        int num3 = sc.nextInt();
        System.out.print("num4 : ");
        int num4 = sc.nextInt();
        System.out.print("num5 : ");
        int num5 = sc.nextInt();
        int max = Math.max(num1,Math.max(num2,Math.max(num3,Math.max(num4,num5))));
        int min = Math.min(num1,Math.min(num2,Math.min(num3,Math.min(num4,num5))));
        System.out.println("-----------------------------------------");
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        sc.close();
    }
}