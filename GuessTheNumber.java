import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;

        System.out.println("ยินดีต้อนรับสู่เกมเดาตัวเลข!");
        System.out.println("ฉันได้สุ่มตัวเลขระหว่าง 1 ถึง 100 แล้ว ลองเดาดูว่าเป็นเลขอะไร!");

        
        do {
            System.out.print("ทายตัวเลข: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("ตัวเลขที่ทายต่ำกว่า!");
            } else if (userGuess > numberToGuess) {
                System.out.println("ตัวเลขที่ทายสูงกว่า!");
            } else {
                System.out.println("ยินดีด้วย! คุณทายถูกต้อง!");
                System.out.println("คุณใช้จำนวนครั้งในการทาย: " + attempts);
            }
        } while (userGuess != numberToGuess);

        scanner.close();
    }
}
