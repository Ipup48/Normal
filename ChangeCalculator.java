import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าราคาสินค้าและจำนวนเงินที่จ่าย
        System.out.print("ราคาสินค้า: ");
        double price = scanner.nextDouble();
        System.out.print("จำนวนเงินที่จ่าย: ");
        double paidAmount = scanner.nextDouble();

        // คำนวณเงินทอน
        double change = paidAmount - price;

        if (change < 0) {
            System.out.println("จำนวนเงินที่จ่ายไม่เพียงพอ!");
        } else {
            System.out.println("เงินทอน: " + change + " บาท");
            calculateChange(change);
        }

        scanner.close();
    }

    // ฟังก์ชันคำนวณเงินทอน
    public static void calculateChange(double change) {
        int[] billsAndCoins = {1000, 500, 100, 50, 20, 10, 5, 1, 0, 0, 0, 0};
        int[] coinValues = {50, 25, 10, 5, 1};

        // คำนวณแบงค์
        for (int bill : billsAndCoins) {
            if (change >= bill) {
                int count = (int) (change / bill);
                change -= count * bill;
                System.out.println("แบงค์ " + bill + " บาท: " + count + " ใบ");
            }
        }

        // คำนวณเหรียญ
        for (int coin : coinValues) {
            if (change >= coin / 100.0) {
                int count = (int) (change / (coin / 100.0));
                change -= count * (coin / 100.0);
                System.out.println("เหรียญ " + coin + " สตางค์: " + count + " เหรียญ");
            }
        }
    }
}