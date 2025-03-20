import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("ป้อนจำนวนตัวเลขที่ต้องการ: ");
        int N = scanner.nextInt();

        
        int[] numbers = new int[N];

      
        System.out.println("ป้อนตัวเลขทั้งหมด " + N + " ตัว:");
        for (int i = 0; i < N; i++) {
            System.out.print("ตัวเลขที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        Arrays.sort(numbers);

        
        System.out.println("ตัวเลขที่เรียงลำดับจากน้อยไปมาก:");
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
