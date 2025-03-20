import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("ป้อนตัวเลขฐาน 10: ");
        int decimalNumber = scanner.nextInt();

        
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        
        System.out.println("เลขฐาน 2 ของ " + decimalNumber + " คือ: " + binaryNumber);

        scanner.close();
    }
}
