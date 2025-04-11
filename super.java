class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void display() {
        super.display();
        System.out.println("Dog name: " + name);
    }
}

public class super {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
    }
}
