class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class this{
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.display();
    }
}
