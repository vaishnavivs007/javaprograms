class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class passbyref {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        System.out.println("Before method call: " + person1.name);
        modifyPerson(person1);
        System.out.println("After method call: " + person1.name);
    }

    public static void modifyPerson(Person person) {
        person.name = "Bob";
        System.out.println("Inside method: " + person.name);
    }
}
