import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าตัวเลขฐาน 10 จากผู้ใช้
        System.out.print("ป้อนตัวเลขฐาน 10: ");
        int decimalNumber = scanner.nextInt();

        // แปลงเป็นเลขฐาน 2 (Binary)
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // แสดงผลลัพธ์
        System.out.println("เลขฐาน 2 ของ " + decimalNumber + " คือ: " + binaryNumber);

        scanner.close();
    }
}