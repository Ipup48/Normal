class Person {
    
    String name;
    int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayInfo() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Person person1 = new Person("สมชาย", 25);

        
        person1.displayInfo();
    }
}
