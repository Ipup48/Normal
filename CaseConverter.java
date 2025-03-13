import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับค่าจากผู้ใช้
        System.out.print("ป้อนข้อความ: ");
        String text = scanner.nextLine();
        
        // แปลงเป็นตัวพิมพ์ใหญ่
        String uppercaseText = text.toUpperCase();
        System.out.println("ตัวพิมพ์ใหญ่: " + uppercaseText);
        
        // แปลงเป็นตัวพิมพ์เล็ก
        String lowercaseText = text.toLowerCase();
        System.out.println("ตัวพิมพ์เล็ก: " + lowercaseText);
        
        scanner.close();
    }
}