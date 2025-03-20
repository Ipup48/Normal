import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("ป้อนข้อความ: ");
        String text = scanner.nextLine();
        
       
        String uppercaseText = text.toUpperCase();
        System.out.println("ตัวพิมพ์ใหญ่: " + uppercaseText);
        
        
        String lowercaseText = text.toLowerCase();
        System.out.println("ตัวพิมพ์เล็ก: " + lowercaseText);
        
        scanner.close();
    }
}
