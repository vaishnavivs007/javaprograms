class Person {
    String name;
    int age;

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class copy {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 25);
        Person person2 = new Person(person1);
        person2.display();
    }
}
