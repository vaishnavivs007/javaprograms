class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person(person2);

        person1.display();
        person2.display();
        person3.display();
    }
}
