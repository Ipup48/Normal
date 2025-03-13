import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าแม่สูตรคูณจากผู้ใช้
        System.out.print("ป้อนค่าแม่สูตรคูณ (เช่น 2, 5, 9): ");
        int number = scanner.nextInt();

        // แสดงแม่สูตรคูณ
        System.out.println("แม่สูตรคูณของ " + number + " คือ:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}