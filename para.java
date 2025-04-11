class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class para {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.display();
    }
}
