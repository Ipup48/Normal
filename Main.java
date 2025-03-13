class Person {
    // กำหนดตัวแปร name และ age
    String name;
    int age;

    // สร้าง constructor เพื่อกำหนดค่าให้กับ name และ age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // สร้างเมธอดเพื่อแสดงผลข้อมูล
    public void displayInfo() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ Person และกำหนดค่าให้กับ name และ age
        Person person1 = new Person("สมชาย", 25);

        // เรียกเมธอด displayInfo() เพื่อแสดงผล
        person1.displayInfo();
    }
}