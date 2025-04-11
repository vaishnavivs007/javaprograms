class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class default {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();
    }
}
